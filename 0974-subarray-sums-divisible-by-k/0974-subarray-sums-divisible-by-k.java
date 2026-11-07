class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0;i<nums.length;i++){
            currentSum += nums[i];
            int remainder = currentSum % k;
            if(remainder<0){
                remainder +=k;
            }
            if(map.containsKey(remainder)){
                count += map.get(remainder);
            }
                map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}