// Problem: Boats to Save People
// Link: https://leetcode.com/problems/boats-to-save-people/

import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        
        while (left <= right) {
            // If the lightest and heaviest person can fit in the same boat
            if (people[left] + people[right] <= limit) {
                left++; // Move past the lightest person
            }
            // Heaviest person always gets on a boat (either alone or with the lightest)
            right--; 
            boats++;
        }
        
        return boats;
    }
}