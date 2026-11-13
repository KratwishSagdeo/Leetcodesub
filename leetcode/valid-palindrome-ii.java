// Problem: Valid Palindrome II
// Link: https://leetcode.com/problems/valid-palindrome-ii/submissions/2195479112/?utm_source=chatgpt.com

class Solution {
    public boolean validPalindrome(String s) {
        int p = 0;
        int q = s.length() - 1;
        
        while (p < q) {
            if (s.charAt(p) == s.charAt(q)) {
                p++;
                q--;
            } else {
                // Mismatch found! Try skipping either the left or right character.
                return isPalindromeRange(s, p + 1, q) || isPalindromeRange(s, p, q - 1);
            }
        }
        return true;
    }
    
    private boolean isPalindromeRange(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}