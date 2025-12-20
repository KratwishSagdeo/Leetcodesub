class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = nums.length/3;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            int key = entry.getKey();
            if(value > n){
                result.add(key);
            }
        }
        return result;
    }
}