// Problem: Subarrays with Sum K
// Link: https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1

class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int res = 0;
        int curr = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i:arr){
            curr+=i;
            res+=map.getOrDefault(curr-k,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;
    }
}