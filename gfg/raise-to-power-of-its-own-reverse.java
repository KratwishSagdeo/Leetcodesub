// Problem: Raise to Power of Its Own Reverse
// Link: https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rem = 0;
        int k = 0;
        int org= n;
        int x = rev(n,rem,k);
        return expo(org,x,1);
    }
    public int rev(int n,int rem,int k){
        if(n<=0){
            return k;
        }
        rem = n%10;
        n = n/10;
        k = k*10+rem;
        return rev(n,rem,k);
    }
    public int expo(int org,int x,int ans){
        if(x<=0){
            return ans;
        }
        return expo(org,x-1,ans*org);
    }
}
