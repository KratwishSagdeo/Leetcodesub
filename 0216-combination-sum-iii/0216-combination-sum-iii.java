class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1,k,n,0,new ArrayList<>());
        return ans;
    }
    void backtrack(int start,int k,int n,int sum,List<Integer>curr){
        if(curr.size() == k && sum == n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(curr.size() > k || sum>n){
            return;
        }
        for(int i = start;i<=9;i++){
            curr.add(i);
            backtrack(i+1,k,n,sum+i,curr);
            curr.remove(curr.size()-1);
        }
    }
}