// Problem: CSES
// Link: https://cses.fi/problemset/result/18063867/

import java.io.*;

class dice {
    static final int MOD = 1000000007;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {

            for (int dice = 1; dice <= 6; dice++) {

                if (i - dice >= 0) {
                    dp[i] = (dp[i] + dp[i - dice]) % MOD;
                }
            }
        }

        System.out.println(dp[n]);
    }
}