// Problem: Largest in Array
// Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

class Solution {
    public static int largest(int[] arr) {
        return gf(arr.length - 1, arr, arr[0]);
    }

    public static int gf(int n, int[] arr, int max) {
        if (n == 0)
            return Math.max(max, arr[0]);

        max = Math.max(max, arr[n]);
        return gf(n - 1, arr, max);
    }
}