// Problem: Find the Index of the First Occurrence in a String
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/2147787383/

class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder sb = new StringBuilder(haystack);
        int index = sb.indexOf(needle);
        return index;
    }
}