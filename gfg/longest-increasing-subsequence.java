// Problem: Longest Increasing Subsequence
// Link: https://www.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1

class Solution {
    static int lis(int arr[]) {
        // code here
        int n = arr.length;
        int dp[] = new int[n];
        for(int i = 0;i<n;i++) dp[i] = 1;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int len = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++) len = Math.max(len,dp[i]);
        return len;
    }
}