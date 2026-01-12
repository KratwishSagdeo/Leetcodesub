class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 1; // at least one substring

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (set.contains(ch)) {
                count++;        // new partition
                set.clear();    // reset substring
            }

            set.add(ch);
        }

        return count;
    }
}
