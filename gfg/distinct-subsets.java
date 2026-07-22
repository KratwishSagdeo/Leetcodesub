// Problem: Distinct Subsets
// Link: https://www.geeksforgeeks.org/problems/subset-sum-ii/1

class Solution {

    public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {

        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        solve(arr, 0, new ArrayList<>(), ans);

        return ans;
    }

    void solve(int[] arr, int index,
               ArrayList<Integer> current,
               ArrayList<ArrayList<Integer>> ans) {

        ans.add(new ArrayList<>(current));

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1])
                continue;

            current.add(arr[i]);

            solve(arr, i + 1, current, ans);

            current.remove(current.size() - 1);
        }
    }
}