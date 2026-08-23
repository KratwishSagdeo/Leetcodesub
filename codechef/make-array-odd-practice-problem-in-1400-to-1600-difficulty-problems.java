// Problem: Make Array Odd Practice Problem in 1400 to 1600 difficulty problems
// Link: https://www.codechef.com/practice/course/2-star-difficulty-problems/DIFF1500/problems/MAKEARRAYODD

import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            int evenCount = 0;
            int oddCount = 0;
            
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (a % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            // Case 1: All elements are already odd
            if (evenCount == 0) {
                sb.append(0).append("\n");
            } 
            // Case 2: X is odd, we can process evens in pairs
            else if (x % 2 != 0) {
                sb.append((evenCount + 1) / 2).append("\n");
            } 
            // Case 3: X is even and there are no odd numbers to help
            else if (oddCount == 0) {
                sb.append(-1).append("\n");
            } 
            // Case 4: X is even and we have at least one odd number
            else {
                sb.append(evenCount).append("\n");
            }
        }
        System.out.print(sb);
    }
}