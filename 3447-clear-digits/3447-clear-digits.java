import java.util.Arrays;
class Solution {
    public String clearDigits(String s) {
    char[] arr = s.toCharArray();
    int n = arr.length;
    char [] stack = new char[n];
    int tos=-1;
    for(int i = 0;i<n;i++){
           if(Character.isLetter(arr[i])){
            stack[++tos] = arr[i];
           }else if(Character.isDigit(arr[i]) && tos>=0){
            tos--;
           }
        }
        if(tos<=-1){
            return "";
        }
        return new String(stack,0,tos+1);
    }
}