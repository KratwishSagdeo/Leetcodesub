class Solution {
    public void reverseString(char[] s) {
        f(0,s.length-1,s);
    }
    public static void f(int left,int right,char []s){
        if(left<right){
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
            left++;
            right--;
            f(left,right,s);
        }else{
            return;
        }
    }
}