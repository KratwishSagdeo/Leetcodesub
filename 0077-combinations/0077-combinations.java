class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1,k,n,new ArrayList<>());
        return result;
    }
    void backtrack(int start,int k,int n,List<Integer> curr){
        if(curr.size() == k){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start;i<=n;i++){
            curr.add(i);
            backtrack(i+1,k,n,curr);
            curr.remove(curr.size()-1);
        }
    }
}