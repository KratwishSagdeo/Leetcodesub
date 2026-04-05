class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        ArrayList <Integer> temp1 = new ArrayList<>();
        ArrayList <Integer> temp2 = new ArrayList<>();
        for(int i = 0;i<n-1;i++){
            temp1.add(nums[i]);
        }
        for(int i = 1;i<n;i++) temp2.add(nums[i]);
        return Math.max(f(temp1),f(temp2));
    }
    public static int f(ArrayList<Integer> nums) {
    int n = nums.size();
    if (n == 0) return 0; // Guard against empty lists
    
    
    int prev = nums.get(0);
    int prev2 = 0;
    
    for (int i = 1; i < n; i++) {
        // Option 1: Rob this house + houses before the previous one
        int take = nums.get(i) + prev2; 
        
        // Option 2: Skip this house, keep the amount from the previous one
        int notTake = prev; 
        
        int curri = Math.max(take, notTake);
        
        // Update pointers for the next iteration
        prev2 = prev;
        prev = curri;
    }
    return prev;
}
}