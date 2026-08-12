class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        for(int i = 0;i<=n;i++){
            dp[i] = i;
            for(int j = 1;j*j<=i;j++){
                int coin = j*j;

                dp[i] = Math.min(dp[i],1+dp[i-coin]);
            }
        }
        return dp[n];
    }
}