class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] S = s.toCharArray();
        char [] T = t.toCharArray();
        boolean []arr= new boolean[S.length];
        int p1 = 0;
        int p2 = 0;
        while(p1<S.length && p2<T.length){
            if(S[p1] == T[p2]){
                arr[p1] = true;
                p1++;
                p2++;
            }else{
                p2++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != true){
                return false;
            }
        }
        return true;
    }
}