// Problem: Target Sum
// Link: https://www.geeksforgeeks.org/problems/target-sum-1626326450/1

class Solution {
    public int totalWays(int[] arr, int target) {
        // code here
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // If the total sum is less than diff, or if (sum + diff) is odd, no solution exists
        if (target > sum || (sum + target) % 2 != 0) {
            return 0;
        }

        int target = (target + sum) / 2;
        int[][] dp = new int[n + 1][target + 1];

        // Base case: 1 way to make sum 0 with 0 elements
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][target];
    }
}