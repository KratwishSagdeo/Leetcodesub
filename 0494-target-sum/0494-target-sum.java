class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // Target cannot be reached if total sum is smaller than |target|
        // or if (sum + target) is odd.
        if (sum < Math.abs(target) || (sum + target) % 2 != 0) {
            return 0;
        }

        int subsetSum = (sum + target) / 2;
        int n = nums.length;
        int[][] dp = new int[n + 1][subsetSum + 1];

        // Base case: 1 way to make sum 0 with 0 elements
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= subsetSum; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][subsetSum];
    }
}