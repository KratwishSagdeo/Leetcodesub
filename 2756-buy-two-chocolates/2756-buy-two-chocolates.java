import java.util.Arrays;
class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int []arr = new int[n];
        System.arraycopy(prices,0,arr,0,prices.length);
        Arrays.sort(arr);
        int i =0;
        int j = i+1;
        if(arr[i]+arr[j]<= money){
            money = money-(arr[i]+arr[j]);
        }else{
            return money;
        }
        return money;
    }
}