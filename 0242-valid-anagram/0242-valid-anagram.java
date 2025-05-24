class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            map1.put(chS, map1.getOrDefault(chS,0)+1);
            map2.put(chT, map2.getOrDefault(chT,0)+1);
        }
        return map1.equals(map2);
    }
}