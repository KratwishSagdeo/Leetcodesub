class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length, count = 0, invalid = 0;

        for (int i = 0; i < k - 1; i++) {
            if (colors[i] == colors[i + 1]) {
                invalid++;
            }
        }

        if (invalid == 0) count++;

        for (int start = 1; start < n; start++) {
            int prevOut = (start - 1) % n;
            int newIn = (start + k - 1) % n;

            if (colors[prevOut] == colors[(prevOut + 1) % n]) {
                invalid--;
            }

            if (colors[newIn] == colors[(newIn - 1 + n) % n]) {
                invalid++;
            }

            if (invalid == 0) count++;
        }

        return count;
    }
}
