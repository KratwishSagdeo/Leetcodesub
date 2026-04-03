class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Step 1: remove leading elements
        while (head != null && head.val == val) {
            head = head.next;
        }

        // If list becomes empty
        if (head == null) return null;

        ListNode temp = head;

        // Step 2: process remaining list
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
