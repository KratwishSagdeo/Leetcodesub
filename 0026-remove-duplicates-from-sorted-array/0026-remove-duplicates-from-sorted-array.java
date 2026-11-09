class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 1;
        int count = 1;
        int i = 0;
        while(i!=nums.length && j<nums.length){
            if(nums[i] == nums[j]){
                j++;
            }else{
                count++;
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return count;
    }
}