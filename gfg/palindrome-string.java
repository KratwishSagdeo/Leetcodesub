// Problem: Palindrome String
// Link: https://www.geeksforgeeks.org/problems/palindrome-string0817/1

class Solution {
    boolean isPalindrome(String s) {
        // code here
        int p1= 0;
        int p2 = s.length()-1;
        return f(s,p1,p2);
    }
    public boolean f(String s,int p1,int p2){
        if(p1>=p2){
            return true;
        }
        char ch1 = s.charAt(p1);
        char ch2 = s.charAt(p2);
        if(ch1 != ch2){
            return false;
        }
            return f(s,p1+1,p2-1);
    }
}