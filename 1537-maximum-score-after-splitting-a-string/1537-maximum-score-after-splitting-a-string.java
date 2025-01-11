class Solution {
    public int maxScore(String s) {
        char[] arr = s.toCharArray();
        int maxCount = 0;
        for (int i = 1; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] == '0') {
                    count++;
                }
            }
            for (int k = i; k < arr.length; k++) {
                if (arr[k] == '1') {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
