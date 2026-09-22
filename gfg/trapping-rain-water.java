// Problem: Trapping Rain Water
// Link: https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1

class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        if (n <= 2) return 0; // Less than 3 blocks cannot trap water

        int water[] = new int[n];
        int maxL[] = new int[n];
        int maxR[] = new int[n];
        int sum = 0;

        maxL[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxL[i - 1]) {
                maxL[i] = arr[i];
            } else {
                maxL[i] = maxL[i - 1];
            }
        }

        maxR[n - 1] = arr[n - 1]; // Fixed: initialize maxR at index n - 1
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxR[i + 1]) {
                maxR[i] = arr[i];
            } else {
                maxR[i] = maxR[i + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            water[i] = Math.min(maxL[i], maxR[i]) - arr[i];
            sum = sum + water[i];
        }

        return sum;
    }
}