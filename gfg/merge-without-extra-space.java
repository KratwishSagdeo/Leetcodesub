// Problem: Merge Without Extra Space
// Link: https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1#better-approach-1-using-nth-smallest-in-the-two-sorted-on-logn-m-logm-time-and-o1-space

class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int hi = a.length-1;
        int lo = 0;
        while(hi>=0 && lo<b.length){
            if(a[hi]<b[lo]){
                hi--;
            }else{
                int temp = a[hi];
            a[hi] = b[lo];
            b[lo] = temp;
            hi--;
            lo++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
