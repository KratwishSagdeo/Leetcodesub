class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int flips = 0;
        int flipCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k && nums[i - k] == 2) {
                flipCount--;
            }

            if ((nums[i] + flipCount) % 2 == 0) {
                if (i + k > nums.length) {
                    return -1;
                }

                nums[i] = 2;
                flipCount++;
                flips++;
            }
        }

        return flips;
    }
}