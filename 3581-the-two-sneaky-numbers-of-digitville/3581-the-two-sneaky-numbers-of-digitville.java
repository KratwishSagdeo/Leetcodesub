class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int j = 0;
        int []arr = new int[2];
        for(int k = 0;k<nums.length;k++){
         for(int i = k+1;i<nums.length;i++){
            if(nums[k] == nums[i]){
                arr[j] = nums[i];
                j++;
            }
        }
        }
        return arr;
    }
}