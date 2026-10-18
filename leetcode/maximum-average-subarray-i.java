// Problem: Maximum Average Subarray I
// Link: https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currentSum = 0;
        
        // Step 1: Calculate the sum of the first window of size k
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        double maxSum = currentSum;
        
        // Step 2: Slide the window across the rest of the array
        for (int i = k; i < nums.length; i++) {
            // Add the new element entering on the right and remove the old element leaving on the left
            currentSum = currentSum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        // Step 3: Return the maximum average
        return maxSum / k;
    }
}