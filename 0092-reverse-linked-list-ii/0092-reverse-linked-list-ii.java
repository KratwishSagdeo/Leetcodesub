class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        int x = 1;
        ListNode temp = head;
        ListNode prevL = null;
        ListNode L = null;
        ListNode R = null;
        ListNode nextR = null;

        // Step 1: Find prevL, L, R, nextR
        while (temp != null && x <= right) {
            if (x == left - 1) prevL = temp;
            if (x == left) L = temp;
            if (x == right) {
                R = temp;
                nextR = R.next;
            }
            temp = temp.next;
            x++;
        }

        // Step 2: Reverse from L to R
        ListNode prev = nextR;
        ListNode curr = L;

        while (curr != nextR) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // Step 3: Reconnect
        if (prevL != null) {
            prevL.next = R;
        } else {
            head = R;
        }

        return head;
    }
}
