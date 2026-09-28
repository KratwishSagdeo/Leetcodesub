// Problem: Missing in Array
// Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

class Solution {
    int missingNum(int arr[]) {
        // code here
        int xor = arr.length+1;
        for(int i = 0;i<arr.length;i++){
            xor ^= i+1;
            xor ^= arr[i];
        }
        return xor;
    }
}