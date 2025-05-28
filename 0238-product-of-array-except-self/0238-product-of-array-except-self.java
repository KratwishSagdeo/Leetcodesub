class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int ans[] = new int[n];

        for(int i = 0;i<nums.length;i++){
            if(i == 0){
                left[i] = 1;
            }else{
                left[i] = left[i-1] * nums[i-1];
            }
        }
        for(int i = n-1;i>=0;i--){
            if(i == n-1){
                right[i] = 1;
            }else{
                right[i] = right[i+1] * nums[i+1];
            }
        }
        for(int i = 0;i<n;i++){
            ans[i] = left[i]* right[i];
        }
        return ans;
    }
}