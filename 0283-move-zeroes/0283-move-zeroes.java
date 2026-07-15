class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        int q = 0;
        while(q<nums.length){
            if(nums[p] == 0 && nums[q] == 0){
                q +=1;
            }else if(nums[p] == 0 && nums[q] != 0){
                int temp = nums[p];
                nums[p] = nums[q];
                nums[q] = temp;
                p+=1;
            }
            if(nums[p] != 0 && nums[q] != 0){
                p+=1;
                q+=1;
            }
        }
    }
}