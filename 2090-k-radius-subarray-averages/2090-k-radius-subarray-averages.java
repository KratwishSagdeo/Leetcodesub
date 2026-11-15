class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        long sum [] = new long[n];
        int arr[] = new int[n];
        
        // Initialize all to -1 by default
        java.util.Arrays.fill(arr, -1);
        
        sum[0] = nums[0];
        for(int i = 1; i < n; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        
        for(int i = 0; i < n; i++){
            int x = i - k;
            int y = i + k;
            if(x < 0 || y >= n){
                arr[i] = -1;
            } else {
                long diff = (x > 0) ? sum[x - 1] : 0;
                arr[i] = (int) ((sum[y] - diff) / (2L * k + 1));
            }
        }
        return arr;
    }
}