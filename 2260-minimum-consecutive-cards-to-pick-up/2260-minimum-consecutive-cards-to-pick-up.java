class Solution {
    public int minimumCardPickup(int[] cards) {

        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int minDist = Integer.MAX_VALUE;

        for (int right = 0; right < cards.length; right++) {

            // jab duplicate mile
            while (set.contains(cards[right])) {
                minDist = Math.min(minDist, right - left + 1);
                set.remove(cards[left]);
                left++;
            }

            set.add(cards[right]);
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}
