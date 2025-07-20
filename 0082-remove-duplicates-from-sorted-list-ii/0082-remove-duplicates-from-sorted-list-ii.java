class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;
        ListNode newHead = null;  // Will point to the head of result list
        ListNode ss = null;       // Tail of the result list

        while (fast != null) {
            boolean isDuplicate = false;

            // Skip all nodes with same value
            while (fast != null && slow.val == fast.val) {
                isDuplicate = true;
                fast = fast.next;
            }

            if (!isDuplicate) {
                // Node is unique — add it to result list
                if (newHead == null) {
                    newHead = slow;
                    ss = newHead;
                } else {
                    ss.next = slow;
                    ss = ss.next;
                }
            }

            // Move slow to fast
            slow = fast;
            fast = (fast != null) ? fast.next : null;
        }

        // Handle the last node (slow) separately
        if (slow != null) {
            boolean isLastUnique = (ss == null || ss.val != slow.val);
            if ((slow.next == null) && isLastUnique) {
                if (newHead == null) {
                    newHead = slow;
                    ss = newHead;
                } else {
                    ss.next = slow;
                    ss = ss.next;
                }
            }
        }

        // End the list
        if (ss != null) ss.next = null;

        return newHead;
    }
}
