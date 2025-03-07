class Solution {
    public void sortColors(int[] nums) {
      int n = nums.length;
      int []arr = new int[n];
      for(int i = 0;i<(n-1);i++){
        int tos = 0;
        while(tos+1 < n-i){
            if(nums[tos] > nums[tos+1]){
                int temp = nums[tos];
                nums[tos] = nums[tos+1];
                nums[tos+1] = temp;
                tos = tos+1;
            }else{
            tos = tos+1;
            }
        }
      }  
    }
}