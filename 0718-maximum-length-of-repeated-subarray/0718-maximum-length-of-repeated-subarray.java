class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int maxLen = 0;

        // Slide nums1 over nums2
        for (int i = 0; i < nums1.length; i++) {
            int len = 0;
            for (int j = 0; j < nums2.length && i + j < nums1.length; j++) {
                if (nums1[i + j] == nums2[j]) {
                    len++;
                    maxLen = Math.max(maxLen, len);
                } else {
                    len = 0; // reset window
                }
            }
        }

        // Slide nums2 over nums1
        for (int i = 1; i < nums2.length; i++) {
            int len = 0;
            for (int j = 0; j < nums1.length && i + j < nums2.length; j++) {
                if (nums2[i + j] == nums1[j]) {
                    len++;
                    maxLen = Math.max(maxLen, len);
                } else {
                    len = 0; // reset window
                }
            }
        }

        return maxLen;
    }
}
