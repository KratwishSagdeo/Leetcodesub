class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 1, right = (int)1e9; // 1 to 10^9 (constraint range)
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canRob(nums, k, mid)) {
                right = mid; // Try a smaller capability
            } else {
                left = mid + 1; // Increase capability
            }
        }
        
        return left; // Smallest capability found
    }
    
    private boolean canRob(int[] nums, int k, int cap) {
        int count = 0;
        int i = 0;
        
        while (i < nums.length) {
            if (nums[i] <= cap) { // Rob this house
                count++;
                i += 2; // Skip adjacent house
            } else {
                i++; // Move to the next house
            }
            
            if (count >= k) return true; // At least k houses robbed
        }
        
        return false;
    }
}