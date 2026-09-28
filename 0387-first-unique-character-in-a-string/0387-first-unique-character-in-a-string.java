class Solution {
    public int firstUniqChar(String s) {
        char ch[] = s.toCharArray();
        int freq[] = new int[26];
        for(int i=0;i<freq.length;i++){
            freq[i] = 0;
        }
        for(int i = 0;i<ch.length;i++){
            freq[ch[i]-'a']+=1;
        }
        for(int i=0;i<ch.length;i++){
            if(freq[ch[i]-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}