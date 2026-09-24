// Problem: Sort 0s, 1s and 2s
// Link: https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

class Solution {
    public void sort012(int[] arr) {
        // code here
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                one++;
            }else if(arr[i] == 2){
                two++;
            }else if(arr[i] == 0){
                zero++;
            }
        }
        int p = 0;
        while(zero>0){
            arr[p] = 0;
            p++;
            zero--;
        }
        while(one > 0){
            arr[p] = 1;
            p++;
            one--;
        }
        while(two>0){
            arr[p] = 2;
            p++;
            two--;
        }
    }
}