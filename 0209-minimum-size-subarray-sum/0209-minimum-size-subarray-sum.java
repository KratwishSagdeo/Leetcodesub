class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minSize = Integer.MAX_VALUE;
        int sum = 0;
        
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Add the current element to the window first
            
            // While the window sum is greater than or equal to the target,
            // record the size and try to shrink the window from the left.
            while (sum >= target) {
                minSize = Math.min(minSize, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        
        // If minSize was never updated, return 0
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}