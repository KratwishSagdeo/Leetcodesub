// Problem: Is Subsequence
// Link: https://leetcode.com/problems/is-subsequence/description/

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // 1. Skip trailing spaces from the end of the string
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 2. Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}