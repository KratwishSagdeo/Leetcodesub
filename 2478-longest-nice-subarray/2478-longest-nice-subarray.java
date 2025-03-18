class Solution {
    public int longestNiceSubarray(int[] nums) {
        if (nums.length == 1) return 1;

        int count = 0, maxCount = 1;
        int p1 = 0, p2 = 0, usedBits = 0;

        while (p2 < nums.length) {
            while ((usedBits & nums[p2]) != 0) { 
                usedBits ^= nums[p1]; 
                p1++; 
                count--; 
            }
            
            usedBits |= nums[p2]; 
            count++;
            maxCount = Math.max(maxCount, count);
            p2++;
        }

        return maxCount;
    }
}
