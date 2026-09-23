// Problem: Coin Change
// Link: https://leetcode.com/problems/coin-change/submissions/2150627009/

class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        
        // Fill array with a dummy large value
        Arrays.fill(dp, max);
        
        // Base case: 0 amount requires 0 coins
        dp[0] = 0;
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        
        // If dp[amount] was never updated, the amount cannot be formed
        return dp[amount] > amount ? -1 : dp[amount];
    }
}