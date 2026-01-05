class Solution {
public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String a = s+s;

        if(a.contains(goal)){
            return true;
        } 
    return false;
    }
}