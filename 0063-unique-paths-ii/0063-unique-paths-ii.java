class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        // Fix 1: Use 'int' for initialization
        int dp[][] = new int[n][m]; 
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // Fix 2: Obstacles are represented by 1
                if(obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } 
                else if(i == 0 && j == 0) {
                    // Start point is only 1 if it's not an obstacle
                    dp[i][j] = 1; 
                } 
                else {
                    int up = 0;
                    int left = 0;
                    if(i > 0) up = dp[i-1][j];
                    if(j > 0) left = dp[i][j-1];
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[n-1][m-1];
    }
}