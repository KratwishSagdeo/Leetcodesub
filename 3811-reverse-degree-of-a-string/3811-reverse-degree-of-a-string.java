class Solution {
    public int reverseDegree(String s) {
       int degree;
       int revDegree;
       int product= 0;
       char [] arr = s.toCharArray();
       for(int i = 0;i<arr.length;i++){
        degree = arr[i] - 'a' +1;
        revDegree = 26-degree+1;
        product = product + (revDegree*(i+1));
       }
       return product;
    }
}