class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxEnd = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(maxEnd + nums[i] > nums[i]){
                maxEnd = maxEnd + nums[i];
            }else{
                maxEnd = nums[i];
            }
            if(max < maxEnd){
                max = maxEnd;
            }
        }
        return max;
    }
}