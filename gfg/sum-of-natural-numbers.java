// Problem: Sum of Natural Numbers
// Link: https://www.geeksforgeeks.org/problems/reverse-coding2452/1

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // code here
        for(int i = 0;i<=n;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}