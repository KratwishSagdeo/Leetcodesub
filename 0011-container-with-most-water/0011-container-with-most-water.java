class Solution {
    public int maxArea(int[] height) {
        int p1 = 0, p2 = height.length - 1;
        int maxArea = 0;
        while (p1 < p2) {
            int h = Math.min(height[p1], height[p2]);
            int area = h * (p2 - p1);
            maxArea = Math.max(maxArea, area);
            if (height[p1] < height[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        return maxArea;
    }
}
