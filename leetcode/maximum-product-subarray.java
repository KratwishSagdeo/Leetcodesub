// Problem: Maximum Product Subarray
// Link: https://leetcode.com/problems/maximum-product-subarray/?utm_source=chatgpt.com

class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];
        for(int i = 1;i<nums.length;i++){
            int curr = nums[i];
            int tempMax = Math.max(curr,Math.max(maxSoFar*curr,minSoFar*curr));
            minSoFar = Math.min(curr,Math.min(minSoFar*curr,maxSoFar*curr));
            maxSoFar = tempMax;
            result = Math.max(result,maxSoFar);
        }
        return result;
    }
}