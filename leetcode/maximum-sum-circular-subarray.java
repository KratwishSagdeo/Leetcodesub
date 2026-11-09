// Problem: Maximum Sum Circular Subarray
// Link: https://leetcode.com/problems/maximum-sum-circular-subarray/?utm_source=chatgpt.com

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int Cmax = 0;
        int Cmin = 0;
        int totalSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        for(int num:nums){
            Cmax = Math.max(Cmax+num,num);
            maxSum = Math.max(Cmax,maxSum);
            Cmin = Math.min(Cmin+num,num);
            minSum = Math.min(minSum,Cmin);

            totalSum += num;
        }
        if(maxSum < 0){
            return maxSum;
        }
        return Math.max(maxSum,totalSum-minSum);
    }
}