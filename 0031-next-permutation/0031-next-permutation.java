class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        // 1️⃣ right se pehla aisa element dhundo jo chhota ho next element se
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // 2️⃣ agar aisa element mil gaya
        if (i >= 0) {
            int j = n - 1;

            // right side me nums[i] se thoda bada element dhundo
            while (nums[j] <= nums[i]) {
                j--;
            }

            // swap karo
            swap(nums, i, j);
        }

        // 3️⃣ right side ko reverse kar do
        reverse(nums, i + 1, n - 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
