class Solution {
    public boolean divideArray(int[] nums) {
        int no = nums.length;
        for(int i= 0;i<no;i++){
            for(int j = i+1;j<=no-1;j++){
                if(nums[i] == nums[j]){
                    nums[i] = 0;
                    nums[j] = 0;
                }
            }
        }
        for(int i = 0;i<no;i++){
            if(nums[i] != 0){
                return false;
            }
        }
        return true;
    }
}