// Problem: Shortest Common Supersequence
// Link: https://leetcode.com/problems/shortest-common-supersequence/

class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        
        int[][] dp = new int[n + 1][m + 1];

        // 1. Build DP table for LCS
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // 2. Backtrack to build the SCS string
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                sb.append(str1.charAt(i - 1)); // Corrected string reference
                i--;
            } else {
                sb.append(str2.charAt(j - 1)); // Added missing append
                j--;
            }
        }

        // 3. Append remaining characters
        while (i > 0) {
            sb.append(str1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            sb.append(str2.charAt(j - 1));
            j--;
        }

        return sb.reverse().toString();
    }
}