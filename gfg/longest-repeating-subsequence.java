// Problem: Longest Repeating Subsequence
// Link: https://www.geeksforgeeks.org/problems/longest-repeating-subsequence2004/1

class Solution {
    public int longestRepSubseq(String s) {
        // code here
        String a = s;
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == 0){
                    dp[i][0] = 0;
                }
                if(j == 0){
                    dp[0][j] = 0;
                }
            }
        }
        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<n+1;j++){
                if(s.charAt(i-1) == a.charAt(j-1) && i != j){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}