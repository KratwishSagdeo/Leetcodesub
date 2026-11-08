class Solution {
    public int missingNumber(int[] arr) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<low){
                low = arr[i];
            }
            if(arr[i]>high){
                high = arr[i];
            }
            sum += arr[i];
        }
        int n = arr.length*(arr.length+1)/2;
        int miss = n-sum;
        return miss;
    }
}