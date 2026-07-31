// Problem: Armstrong Numbers
// Link: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int num = n;
        int x = n;
        int numberCount = 0;
        while(num>0){
            numberCount+=1;
            num= num/10;
        }
        int sum = 0;
        while(n>0){
            int rem = n%10;
            int remSum = 1;
            for(int i = 0;i<numberCount;i++){
                remSum = remSum*rem;
            }
            sum = sum+remSum;
            n = n/10;
        }
        if(sum == x){
            return true;
        }
        return false;
    }
}