class Solution {
    public long maximumTripletValue(int[] nums) {
        long trians = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int k = j + 1;
                while(k < nums.length){
                    long max = (long)(nums[i] - nums[j]) * nums[k];
                    
                    if(trians < max){
                        trians = max;
                    }
                    k++;
                }
            }
        }
        return trians < 0 ? 0 : trians;
    }
}
