class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        arr1[0] = 0;
        arr2[n-1] = 0;
        int sum1 = nums[0];
        int sum2 = nums[n-1];
        for(int i = 1;i<n;i++){
            arr1[i] = sum1;
            sum1 += nums[i];
        }
        for(int i = n-2;i>=0;i--){
            arr2[i] = sum2;
            sum2 += nums[i];
        }
        for(int i = 0;i<n;i++){
            if(arr1[i] == arr2[i]){
                return i;
            }
        }
        return -1;
    }
}