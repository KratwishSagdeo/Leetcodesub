// Problem: Find the Difference
// Link: https://leetcode.com/problems/find-the-difference/submissions/2193673366/?utm_source=chatgpt.com

class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i<s.length();i++){
            sum1 = sum1 + ((int) s.charAt(i));
        }
        for(int i = 0;i<t.length();i++){
            sum2 = sum2 + ((int) t.charAt(i));
        }
        sum1 = sum2-sum1;
        return (char) sum1;
    }
}