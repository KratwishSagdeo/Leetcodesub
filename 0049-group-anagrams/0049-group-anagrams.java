class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List> map = new HashMap<>(); 
        for(String s : strs){ // strs me multiple string hai so s
            int count[] = new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i:count){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}