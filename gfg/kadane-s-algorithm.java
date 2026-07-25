// Problem: Kadane's Algorithm
// Link: https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

import java.util.*;
import java.io.*;

class ka{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int maxElement = arr[0];
        int res = arr[0];
        for(int i = 1;i<n;i++){
            maxElement = Math.max(maxElement+arr[i], arr[i]);
            res = Math.max(res, maxElement);
        }
        System.out.println(res);
    }
}