class Solution {

    public int countCompleteSubarrays(int[] nums) {
        // Step 1: count distinct elements in entire array
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int k = set.size();

        // Step 2: exactly k = atMost(k) - atMost(k - 1)
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, res = 0;

        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            while (freq.size() > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                left++;
            }

            res += right - left + 1;
        }
        return res;
    }
}
