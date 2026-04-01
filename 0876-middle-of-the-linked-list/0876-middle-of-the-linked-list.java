/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int n;
        if(count %2 == 0){
            n = (count+1)/2;
        }else{
            n = (count)/2;
        }
        int x = 0;
        temp = head;
        while(x!=n){
            temp = temp.next;
            x++;
        }
        return temp;
    }
}