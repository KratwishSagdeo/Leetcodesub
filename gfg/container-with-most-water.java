// Problem: Container With Most Water
// Link: https://www.geeksforgeeks.org/problems/container-with-most-water0535/1

class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int n = arr.length;
        int p1 = 0;
        int p2 = n-1;
        int sum = 0;
        while(p1<p2){
            int diff = p2-p1;
            sum = Math.max(sum,Math.min(arr[p1],arr[p2])*diff);
            if(arr[p1]<arr[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return sum;
    }
}