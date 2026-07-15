class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int a = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                a=entry.getKey();
            }
        }
        return a;
    }
}