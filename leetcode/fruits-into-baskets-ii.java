// Problem: Fruits Into Baskets II
// Link: https://leetcode.com/problems/fruits-into-baskets-ii/submissions/2176781122/

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        for(int i = 0;i<fruits.length;i++){
            for(int j = 0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    fruits[i] = 0;
                    baskets[j] = 0;
                    break;
                }
            }
        }
        int count=0;
        for(int i = 0;i<fruits.length;i++){
            if(fruits[i]!=0){
                count++;
            }
        }
        return count;
    }
}