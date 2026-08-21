// Problem: Rod Cutting
// Link: https://www.geeksforgeeks.org/problems/rod-cutting0840/1

class Solution {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int len [] = new int[n];
        for(int i = 0;i<n;i++){
            len[i] = i+1;
        }
        int dp[][] = new int[n+1][len.length+1];
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<len.length+1;j++){
                if(i==0){
                    dp[i][0] = 0;
                }
                if(j == 0){
                    dp[0][j] = 0;
                }
            }
        }
        for(int i= 1;i<=n;i++){
            for(int j = 1;j<=len.length;j++){
                if(len[i-1]<=j){
                    dp[i][j] = Math.max(price[i-1]+dp[i][j-len[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][len.length];
    }
}