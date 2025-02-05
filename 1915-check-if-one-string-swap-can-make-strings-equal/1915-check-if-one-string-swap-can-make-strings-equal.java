import java.util.Arrays;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int p1;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        if (s1.equals(s2)) {
            return true;
        }

        for (int i = 0; i < ch2.length; i++) {
            p1 = i + 1;
            while (p1 < ch2.length) {
                char temp = ch2[i];
                ch2[i] = ch2[p1];
                ch2[p1] = temp;

                if (Arrays.equals(ch1, ch2)) {
                    return true;
                }

                // Revert the swap
                temp = ch2[i];
                ch2[i] = ch2[p1];
                ch2[p1] = temp;

                p1++;
            }
        }

        return false;
    }
}
