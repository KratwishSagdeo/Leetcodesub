// Problem: Subsets
// Link: https://www.geeksforgeeks.org/problems/subsets-1613027340/1

class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        solve(arr,0,current,ans);
        return ans;
    }
    public void solve(int arr[],int index,ArrayList<Integer> current,ArrayList<ArrayList<Integer>> ans){
        if(index == arr.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        solve(arr,index+1,current,ans);
        current.remove(current.size()-1);
        solve(arr,index+1,current,ans);
    }
}