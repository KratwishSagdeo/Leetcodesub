class Solution {
    public int longestPalindrome(String s) {
        char ch[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int length = 0;
        boolean hasOdd = false;
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            
            if (val % 2 == 0) {
                length += val; // Fully use even counts
            } else {
                length += val - 1; // Use the largest even portion of the odd count
                hasOdd = true;     // Flag that we have an odd character available for the center
            }
        }
        
        // If we found at least one character with an odd frequency, 
        // we can put one of them in the exact center of the palindrome
        if (hasOdd) {
            length += 1;
        }
        
        return length;
    }
}