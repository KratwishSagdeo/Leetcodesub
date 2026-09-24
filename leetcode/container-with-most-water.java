// Problem: Container With Most Water
// Link: https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int p1 = 0;
        int p2 = n-1;
        int sum = 0;
        while(p1<p2){
            int diff = p2-p1;
            sum = Math.max(sum,(Math.min(height[p1],height[p2])*diff));
            if(height[p1]<height[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return sum;
    }
}