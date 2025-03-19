class Solution {
    public int minOperations(int[] nums) {
        int p1 = 0;
        int p2 = 2;
        int opreations = 0;
        while(p2<nums.length){
            if(nums[p1] == 0){
                for(int i = p1;i<= p2;i++){
                    nums[i] = (nums[i] == 0) ? 1:0;
                }
                opreations++;
            }
            p1++;
            p2++;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                return -1;
            }
        }
        return opreations;
    }
}