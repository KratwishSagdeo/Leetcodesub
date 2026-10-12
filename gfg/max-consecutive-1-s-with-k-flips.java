// Problem: Max Consecutive 1's with K Flips
// Link: https://www.geeksforgeeks.org/problems/maximize-number-of-1s0905/1

class Solution {
    public int maxOnes(int arr[], int k) {
        int n = arr.length;
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            if (arr[right] == 0) {
                zeroCount++;
            }

            // If zeros exceed k, shrink the window from the left
            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}