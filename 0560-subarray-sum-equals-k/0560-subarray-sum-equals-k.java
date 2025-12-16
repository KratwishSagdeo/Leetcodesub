class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int currSum = 0;
        int count = 0;

        for(int i = 0;i<nums.length;i++){
            currSum = currSum + nums[i];

            if(map.containsKey(currSum - k)){
                count = count + map.get(currSum - k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
    }
            return count;
    }
}