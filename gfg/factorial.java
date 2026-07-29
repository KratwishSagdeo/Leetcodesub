// Problem: Factorial
// Link: https://www.geeksforgeeks.org/problems/factorial5739/1

class Solution {
    int factorial(int n) {
        // code here
        if(n == 0) return 1;
        return n*factorial(n-1);
    }
}
