// Problem: Partition Equal Subset Sum
// Link: https://www.geeksforgeeks.org/problems/subset-sum-problem2014/1

class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum = sum+arr[i];
        }
        if(sum%2 != 0){
            return false;
        }
        int w = sum/2;
        boolean dp[][] = new boolean[n+1][w+1];
        for(int i = 0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=w;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
}