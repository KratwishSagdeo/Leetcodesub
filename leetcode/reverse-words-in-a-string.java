// Problem: Reverse Words in a String
// Link: https://leetcode.com/problems/reverse-words-in-a-string/submissions/2153195294/

class Solution {
    public String reverseWords(String s) {
        String words[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}