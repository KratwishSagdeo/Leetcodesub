class Solution {
    public int[] sortedSquares(int[] nums) {
        int right = nums.length-1;
        int left = 0;
        int p1 = nums.length-1;
        int arr[] = new int[nums.length];
        while(right>=left && p1>=0){
            int x = Math.abs(nums[left]);
            int y = Math.abs(nums[right]);
            if(x>y){
                arr[p1] = x*x;
                left++;
                p1--;
            }else{
                arr[p1] = y*y;
                right--;
                p1--;
            }
        }
        return arr;
    }
}