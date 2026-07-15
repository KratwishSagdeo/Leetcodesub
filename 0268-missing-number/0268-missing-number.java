class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n*(n+1))/2;
        int count = 0;
        for(int i = 0;i<n;i++){
            count = nums[i]+count;
        }
        total = total-count;
        return total;
    }
}