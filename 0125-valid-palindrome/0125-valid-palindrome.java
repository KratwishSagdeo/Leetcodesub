class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        char[] fin = new char[chars.length]; // max needed size
        int len = 0; // actual valid character count

        // Step 1: Filter alphanumeric characters and convert uppercase to lowercase
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int ascii = (int) c;

            // Check if it's a digit
            if (ascii >= 48 && ascii <= 57) {
                fin[len++] = c;
            }
            // Check if it's an uppercase letter
            else if (ascii >= 65 && ascii <= 90) {
                fin[len++] = (char) (ascii + 32); // convert to lowercase
            }
            // Check if it's a lowercase letter
            else if (ascii >= 97 && ascii <= 122) {
                fin[len++] = c;
            }
            // Skip other characters
        }

        // Step 2: Check if the filtered char array is a palindrome
        int p1 = 0;
        int p2 = len - 1;

        while (p1 < p2) {
            if (fin[p1] != fin[p2]) {
                return false;
            }
            p1++;
            p2--;
        }

        return true;
    }
}
