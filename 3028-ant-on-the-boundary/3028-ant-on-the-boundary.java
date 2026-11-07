class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int preSum = 0;
        int count=0;
        int arr[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            preSum += nums[i];
            arr[i] = preSum;
        }
        for(int i = 0;i<nums.length;i++){
            if(arr[i] == 0){
                count++;
            }
        }
        return count;
    }
}