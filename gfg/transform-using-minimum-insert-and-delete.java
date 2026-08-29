// Problem: Transform using Minimum Insert and Delete
// Link: https://www.geeksforgeeks.org/problems/minimum-number-of-deletions-and-insertions0209/1

class Solution {
    public int minOperations(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int dp [][] = new int[n+1][m+1];
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
        for(int i =1;i<n+1;i++){
            for(int j = 1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return n-dp[n][m]+m-dp[n][m];
    }
}