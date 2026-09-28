class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        int loc = 0;
        int n = nums.length;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                zeros +=1;
                loc = i;
            }
        }
        if(zeros>1){
            Arrays.fill(nums,0);
            return nums;
        }
        int mul = 1;
        for(int i = 0;i<n;i++){
            if(nums[i] == 0){
                continue;
            }else{
                mul = mul*nums[i];
            }
        }
        if(zeros == 1){
            for(int i = 0;i<n;i++){
            if(nums[i] ==0 ){
                nums[i] = mul;
            }else{
            nums[i] =0;
            }
        }
        return nums;
        }
        else{
            for(int i = 0;i<n;i++){
            nums[i] =mul/nums[i];
        }
        }
        return nums;
    }
}