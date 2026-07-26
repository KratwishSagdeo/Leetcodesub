// Problem: Infosys SP and DSE Coding Questions
// Link: https://prepinsta.com/infosys-sp-and-dse/coding-questions/

import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int[] monster = new int[n];
        int[] bonus = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            monster[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            bonus[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int p = 0;

        while (p < n) {

            if (monster[p] == -1) {
                p++;
                continue;
            }

            if (monster[p] <= e) {
                monster[p] = -1;
                e += bonus[p];   // or e += bonus[p], depending on the problem
                bonus[p] = 0;
                count++;
                p = 0;
            } else {
                p++;
            }
        }

        System.out.println(count);
    }
}