class Solution {
    public boolean isValid(String s) {
        int tos = 0;
        char[] arr = s.toCharArray();
        char[] chars = new char[arr.length];
        for(int i = 0;i<arr.length;i++){
            char c = arr[i];
            if (c == '(' || c == '[' || c == '{') {
                chars[tos++] = c;
            }else{
                if (tos == 0) return false;
                char top = chars[tos - 1];
                if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')) {
                    tos--; // pop
                } else {
                    return false;
                }
            }
        }
        if(tos == 0){
            return true;
        }
        return false;
    }
}