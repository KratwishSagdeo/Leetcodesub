// Problem: 0
// Link: https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int dp [][] = new int[n+1][W+1];
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=W;j++){
                if(i == 0){
                    dp[i][0] = 0;
                }
                if(j == 0){
                    dp[0][j] = 0;
                }
            }
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=W;j++){
                if(wt[i-1]<=j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}
