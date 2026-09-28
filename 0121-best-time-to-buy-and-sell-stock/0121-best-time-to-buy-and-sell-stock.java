class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxP = 0; // Initialize to 0 since profit can't be negative

        for (int i = 1; i < prices.length; i++) {
            int sell = prices[i];
            
            if (sell < buy) {
                buy = sell; // Update the lowest buy price found so far
            } else {
                int profit = sell - buy;
                if (profit > maxP) {
                    maxP = profit;
                }
            }
        }
        return maxP;
    }
}