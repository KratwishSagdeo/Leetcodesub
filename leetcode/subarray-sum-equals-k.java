// Problem: Subarray Sum Equals K
// Link: https://leetcode.com/problems/subarray-sum-equals-k/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int curr = 0;//this variable stores the prefix sum for each element in array
        int res = 0;//this variable stores the sum of number of (curr-k) in hashmap
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            curr += num;
            res += map.getOrDefault(curr-k,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;
    }
}