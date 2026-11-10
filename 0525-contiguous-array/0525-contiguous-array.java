class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int maxLength = 0;
        int runningSum = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                runningSum +=1;
            }else{
                runningSum -=1;
            }
            if(map.containsKey(runningSum)){
                int previousIndex = map.get(runningSum);
                int currentLength = i-previousIndex;
                maxLength = Math.max(maxLength,currentLength);
            }else{
                map.put(runningSum,i);
            }
        }
        return maxLength;
    }
}