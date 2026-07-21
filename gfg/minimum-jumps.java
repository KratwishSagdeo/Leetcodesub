// Problem: Minimum Jumps
// Link: https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        int dp[] = new int[n];
        for(int i = 1;i<n;i++) dp[i] = n+1;
        dp[0] = 0;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(j+dp[j]>=i){
                    dp[i] = Math.min(dp[i],dp[j]+1);
                }
            }
        }
        if(dp[n-1] == n+1){
            return -1;
        }
        return dp[n-1];
    }
}