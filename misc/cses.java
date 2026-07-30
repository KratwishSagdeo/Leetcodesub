// Problem: CSES
// Link: https://cses.fi/problemset/result/18150336/

import java.io.*;
import java.util.*;

class smaller {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int fin[] = new int[n];

        fin[0] = 0;

        int index = 1;
        int left = index - 1;

        while (index < n) {

            if (left < 0) {
                fin[index] = 0;
                index++;

                if (index < n)
                    left = index - 1;
            } else {

                if (arr[left] < arr[index]) {
                    fin[index] = left + 1;   // 1-based position
                    index++;

                    if (index < n)
                        left = index - 1;
                } else {
                    left--;
                }
            }
        }

        for (int x : fin)
            System.out.print(x + " ");
    }
}