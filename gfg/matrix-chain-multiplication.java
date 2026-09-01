// Problem: Matrix Chain Multiplication
// Link: https://www.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1

import java.util.Arrays;

class Solution {
    static int[][] dp;

    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        dp = new int[n][n];

        // Fill dp table with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Matrices are indexed from 1 to n-1
        return solve(arr, 1, n - 1);
    }

    public static int solve(int[] arr, int i, int j) {
        // Base condition: single matrix or invalid range has 0 cost
        if (i >= j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int mn = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int temp = solve(arr, i, k) 
                       + solve(arr, k + 1, j) 
                       + (arr[i - 1] * arr[k] * arr[j]);

            mn = Math.min(mn, temp);
        }

        return dp[i][j] = mn;
    }
}