// Problem: Find First and Last Position of Element in Sorted Array
// Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = f1(nums,target);
        arr[1] = f2(nums,target);
        return arr;
    }
    private int f1(int nums1 [],int target1){
        int l = 0;
        int r = nums1.length-1;
        int x = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums1[mid] == target1){
                x = mid;
                r = mid-1;
            }else if(nums1[mid]>target1){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return x;
    }
    private int f2(int nums2[],int target2){
        int l = 0;
        int r = nums2.length-1;
        int y = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums2[mid] == target2){
                y = mid;
                l = mid+1;
            }else if(nums2[mid]>target2){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return y;
    }
}