// Problem: Stickler Thief
// Link: https://www.geeksforgeeks.org/problems/stickler-theif-1587115621/1#expected-approach-2-spaceoptimized-dp-on-time-and-o1-space

class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        int dp [] = new int[n+1];
        dp[0] = 0;
        dp[1] = arr[0];
        for(int i = 2;i<=n;i++){
            dp[i] = Math.max((dp[i-2]+arr[i-1]),dp[i-1]);
        }
        return dp[n];
    }
}