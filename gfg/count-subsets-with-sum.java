// Problem: Count Subsets with Sum
// Link: https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1

class Solution {
    static int perfectSum(int[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n + 1][target + 1];

        // Base case: 1 way to make sum 0 with 0 elements (empty set)
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) { // Start j from 0 to handle 0 elements correctly
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