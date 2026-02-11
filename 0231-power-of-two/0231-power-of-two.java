class Solution {
    public boolean isPowerOfTwo(int n) {
        int check = 1;
        for(int i = 0;i<32;i++){
            if(check == n){
                return true;
            }
            if(check<n){
                check = check*2;
            }
        }
        return false;
    }
}