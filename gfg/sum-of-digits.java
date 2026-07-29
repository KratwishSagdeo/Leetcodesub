// Problem: Sum Of Digits
// Link: https://www.geeksforgeeks.org/problems/sum-of-digits1742/1

class Solution {
    static int sumOfDigits(int n) {
        // code here
        return f(n,0);
    }
    public static int f(int n,int r){
        if(n == 0) return r;
        r = n%10+r;
        n=n/10;
        return f(n,r);
    }
}
