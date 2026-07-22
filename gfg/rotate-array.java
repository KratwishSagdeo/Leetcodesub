// Problem: Rotate Array
// Link: https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        d = d % arr.length;
        reverse(0,d-1,arr);
        reverse(d,arr.length-1,arr);
        reverse(0,arr.length-1,arr);
    }
    public void reverse(int s,int e,int arr[]){
        if(s>=e){
            return;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverse(s+1,e-1,arr);
    }
}