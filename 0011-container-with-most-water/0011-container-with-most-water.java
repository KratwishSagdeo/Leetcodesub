class Solution {
    public int maxArea(int[] height) {
        int p1 = 0, p2 = height.length - 1;
        int maxArea = 0;
        int area = 0;
        int n;
        while (p1 < p2) {
            if(height[p1] <= height[p2]){
                n = p2-p1;
                area = height[p1] * n;
                if(area > maxArea){
                    maxArea = area;
                }
                p1++;
            }else{
                n = p2-p1;
                area = height[p2] * n;
                if(area > maxArea){
                    maxArea = area;
                }
                p2--;
            }
        }
        return maxArea;
    }
}