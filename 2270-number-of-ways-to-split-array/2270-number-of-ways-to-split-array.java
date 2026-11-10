class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] arr1 = new long[n]; // Use long to prevent integer overflow
        long[] arr2 = new long[n];
        long sum1 = 0;
        long sum2 = 0;
        int count = 0;

        // Build prefix sums (left part sums)
        for (int i = 0; i < n; i++) {
            sum1 += nums[i];
            arr1[i] = sum1; // FIX: store at index i
        }

        // Build suffix sums (right part sums)
        for (int i = n - 1; i >= 0; i--) {
            sum2 += nums[i];
            arr2[i] = sum2;
        }

        // Check all valid split indices from 0 to n - 2
        for (int i = 0; i < n - 1; i++) {
            if (arr1[i] >= arr2[i + 1]) { // Left sum >= Right sum
                count++;
            }
        }

        return count;
    }
}