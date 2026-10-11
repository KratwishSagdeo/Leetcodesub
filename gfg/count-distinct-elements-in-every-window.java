// Problem: Count Distinct Elements in Every Window
// Link: https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int n = arr.length;
        HashMap <Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ans.add(map.size());
        for(int i = k;i<arr.length;i++){
            int out = arr[i-k];
            map.put(out,map.get(out)-1);
            if(map.get(out) == 0){
                map.remove(out);
            }
            int in = arr[i];
            map.put(in,map.getOrDefault(in,0)+1);
            ans.add(map.size());
        }
        return ans;
    }
}