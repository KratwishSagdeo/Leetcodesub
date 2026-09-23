// Problem: Coin Change (Count Ways)
// Link: https://www.geeksforgeeks.org/problems/coin-change2448/1

class Solution {
    public int count(int coins[], int sum) {
        // code here.
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i = 0;i<=n;i++){
            dp[i][0] = 1;
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=sum;j++){
                if(coins[i-1]<=j){
                    dp[i][j] = dp[i-1][j]+dp[i][j-coins[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}