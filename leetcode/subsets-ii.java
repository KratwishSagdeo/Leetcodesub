// Problem: Subsets II
// Link: https://leetcode.com/problems/subsets-ii/editorial/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort so duplicates are adjacent

        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int start, int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        // Every state is a valid subset
        ans.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicates at the same recursion level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // Choose
            curr.add(nums[i]);

            // Explore
            backtrack(i + 1, nums, curr, ans);

            // Undo choice (backtrack)
            curr.remove(curr.size() - 1);
        }
    }
}