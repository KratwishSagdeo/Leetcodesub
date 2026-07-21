// Problem: Minimize the Heights II
// Link: https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1

import java.util.*;

class Solution {
    public int getMinDiff(int[] arr, int k) {

        int n = arr.length;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {

            // Heights cannot become negative
            if (arr[i] - k < 0)
                continue;

            int minHeight = Math.min(arr[0] + k, arr[i] - k);
            int maxHeight = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            ans = Math.min(ans, maxHeight - minHeight);
        }

        return ans;
    }
}