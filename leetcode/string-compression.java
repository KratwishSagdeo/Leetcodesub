// Problem: String Compression
// Link: https://leetcode.com/problems/string-compression/submissions/2195687405/?utm_source=chatgpt.com

class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        while (i < chars.length) {
            char currChar = chars[i];
            int count = 0;
            
            // Count consecutive matching characters
            while (i < chars.length && chars[i] == currChar) {
                count++;
                i++;
            }
            
            sb.append(currChar);
            if (count > 1) {
                sb.append(count);
            }
        }
        
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        
        return sb.length();
    }
}