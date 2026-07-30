class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
       combination(0, candidates, new ArrayList<>(), ans, target);
        return ans;
    }
    public void combination(int start,int candidates[],List<Integer> curr,List<List<Integer>> ans,int targetRem){
        if(targetRem == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start;i<candidates.length;i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            if(targetRem < candidates[i]){
                break;
            }
            curr.add(candidates[i]);
            combination(i+1,candidates,curr,ans,targetRem-candidates[i]);
            curr.remove(curr.size() - 1);
        }
    }
}