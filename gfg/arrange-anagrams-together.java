// Problem: Arrange Anagrams Together
// Link: https://www.geeksforgeeks.org/problems/print-anagrams-together/1

class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String,List> map = new HashMap<>();
        for(String s:arr){
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
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}