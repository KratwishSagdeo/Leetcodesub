// Problem: Longest Common Substring
// Link: https://www.geeksforgeeks.org/problems/longest-common-substring1452/1

class Solution {
    public int longCommSubstr(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int maxLength = 0;
        int dp[][] = new int[n+1][m+1];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i == 0){
                    dp[i][0] = 0;
                }
                if(j == 0){
                    dp[0][j] = 0;
                }
            }
        }
        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<m+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                    maxLength = Math.max(maxLength,dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return maxLength;
    }
}