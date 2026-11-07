// Problem: Find Pivot Index
// Link: https://leetcode.com/problems/find-pivot-index/?utm_source=chatgpt.com

class Solution {
    public int pivotIndex(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int Lsum = 0;
        int Rsum = 0;
        for(int i = 0;i<nums.length;i++){
            Lsum += nums[i];
            arr1[i] = Lsum;
        }
        for(int i = nums.length-1;i>=0;i--){
            Rsum += nums[i];
            arr2[i] = Rsum;
        }
        for(int i = 0;i<nums.length;i++){
            if(arr1[i] == arr2[i]){
                return i;
            }
        }
        return -1;
    }
}