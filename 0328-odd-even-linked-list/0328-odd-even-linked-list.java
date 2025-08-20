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
    public ListNode oddEvenList(ListNode head) {
        // If list is empty or has only one node, no changes needed
        if (head == null || head.next == null) {
            return head;
        }

        // 'odd' will track the last node in the odd index list
        ListNode odd = head;
        // 'even' will track the last node in the even index list
        ListNode even = head.next;
        // save the start of even list to attach at end of odd list later
        ListNode evenHead = even;

        // Traverse the list while the last even and the next odd node exist
        while (even != null && even.next != null) {
            odd.next = even.next;    // link odd node to next odd node
            odd = odd.next;          // move odd pointer forward

            even.next = odd.next;    // link even node to next even node
            even = even.next;        // move even pointer forward
        }

        // Connect the end of odd list to the head of even list
        odd.next = evenHead;

        return head;  // Return the reordered list
    }
}
