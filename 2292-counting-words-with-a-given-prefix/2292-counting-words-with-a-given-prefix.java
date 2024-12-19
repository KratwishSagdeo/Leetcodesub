class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int n = words.length;
        for(int i = 0;i<n;i++){
            if(words[i].startsWith(pref)){
                count = count+1;
            }
        }
        return count;
    }
}