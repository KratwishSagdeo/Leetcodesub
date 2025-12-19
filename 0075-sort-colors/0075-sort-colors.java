class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;

        // count
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zero++;
            else if (nums[i] == 1) one++;
            else two++;
        }

        int j = 0;

        // fill zeros
        while (zero > 0) {
            nums[j++] = 0;
            zero--;
        }

        // fill ones
        while (one > 0) {
            nums[j++] = 1;
            one--;
        }

        // fill twos
        while (two > 0) {
            nums[j++] = 2;
            two--;
        }
    }
}
