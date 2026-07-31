// Problem: Move All Zeroes to End
// Link: https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<arr.length){
            arr[count++] = 0;
        }
    }
}