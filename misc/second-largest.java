// Problem: second largest
// Link: 

import java.io.*;
import java.util.*;
class chatgpt1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int hi = Integer.MIN_VALUE;
        int secHi = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>hi){
                secHi = hi;
                hi = num;
            }else if( num>secHi && num < hi){
                secHi = num;
            }
        }
        return (secHi == Integer.MIN_VALUE) ? -1 : secHi;

    }
}