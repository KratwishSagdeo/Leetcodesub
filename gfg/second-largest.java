// Problem: Second Largest
// Link: https://www.geeksforgeeks.org/problems/second-largest3735/1

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int smax = -1;
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }else if(arr[i]>smax && arr[i] != max){
                smax = arr[i];
            }
        }
        return smax;
    }
}