// Problem: Indexes of Subarray Sum
// Link: https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

import java.io.*;
import java.util.*;

class GivenSum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0;
        int p2 = 0;

        int sum = arr[0];

        while (p1 < n && p2 < n) {

            if (sum == k) {
                System.out.println("Yes");
                return;
            }

            if (sum < k) {
                p2++;

                if (p2 < n)
                    sum += arr[p2];
            }
            else {
                sum -= arr[p1];
                p1++;
            }
        }

        System.out.println("No");
    }
}