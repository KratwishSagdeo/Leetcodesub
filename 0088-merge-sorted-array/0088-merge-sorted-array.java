import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1;
        int p2 = 0;
        while(p2<n){
            for(p1 = m;p1<nums1.length;p1++){
                nums1[p1] = nums2[p2];
                p2++;
            }
        }
        Arrays.sort(nums1);
    }
}