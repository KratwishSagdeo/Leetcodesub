class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num:nums){
            minHeap.offer(num);// this pushes the element into the heap in a sorted manner
            if(minHeap.size() >k){
                minHeap.poll(); // this method removes the first element in the heap as this is a min heap this removes the smallest element
            }
        }
        return minHeap.peek();
    }
}