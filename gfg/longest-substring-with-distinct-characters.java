// Problem: Longest Substring with Distinct Characters
// Link: https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1

class Solution {
    public int longestUniqueSubstr(String s) {
        char ch[] = s.toCharArray();
        int left = 0;
        int right = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            if (map.containsKey(ch[right])) {
                left = Math.max(left, map.get(ch[right]) + 1);
            }
            map.put(ch[right], right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}