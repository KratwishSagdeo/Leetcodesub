class Solution {
    public int smallestNumber(int n) {
        int []arr = {1,3,7,15,31,63,127,255,511,1023};
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=n){
                return arr[i];
            }
        }
         return 0;
    }
}