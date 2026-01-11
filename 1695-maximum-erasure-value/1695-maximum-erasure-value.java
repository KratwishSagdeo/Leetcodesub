class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int sum = 0;
        int left = 0;
        int maxSum = 0;
        for(int right = 0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum = sum-nums[left];
                left++;
            }
            set.add(nums[right]);
            sum = sum+nums[right];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}