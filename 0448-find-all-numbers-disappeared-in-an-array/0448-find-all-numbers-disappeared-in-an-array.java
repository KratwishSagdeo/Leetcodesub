class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>(n);
        
        // 1. Populate the list with 0s up to size n
        for(int i = 0; i < n; i++){
            list.add(0);
        }
        
        // 2. Mark numbers that exist (using nums[i] - 1 for 0-based index mapping)
        for(int i = 0; i < n; i++){
            int val = Math.abs(nums[i]);
            list.set(val - 1, val);
        }
        
        // 3. Collect the missing numbers (where the list is still 0)
        for(int i = 0; i < n; i++){
            if(list.get(i) != 0){
                list.remove(i);
                list.add(i, 0); // Keep placeholder size so indices don't shift
                // Alternatively, you can just collect missing items into a separate result list, 
                // but if keeping your exact structure, this placeholder prevents out-of-bounds.
            } else {
                list.set(i, i + 1); // Store the missing number (1-based)
            }
        }
        
        // Clean up remaining 0 placeholders if needed, or filter them out
        list.removeIf(val -> val == 0);
        
        return list;
    }
}