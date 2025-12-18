class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int m = 2*n;
        int []ans = new int[m];
        int j = 0;
        int i = 0;
        while(j<m){
            if(i == n){
                i = 0;
                ans[j] = nums[i];
            }
            ans[j] = nums[i];
            i++;
            j++;
        }
        return ans;
    }
}