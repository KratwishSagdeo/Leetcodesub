// Problem: CSES
// Link: https://cses.fi/problemset/result/18204661/

import java.util.*;
import java.io.*;
class Remove{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long arr[] = new long[n+1];
        arr[0] = 1;
        for(int i = 1;i<=n;i++){
            for(int dice = 1;dice<=6;dice++){
                if(i-dice>=0){
                    arr[i] = (arr[i] + arr[i-dice]) % 1000000007;
            }
        }
    }
    System.out.println(arr[n]);
}
}