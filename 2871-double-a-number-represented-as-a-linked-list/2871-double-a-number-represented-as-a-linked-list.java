class Solution {
    public ListNode doubleIt(ListNode head) {
        int carry = helper(head);
        if (carry != 0) {
            return new ListNode(carry, head);
        }
        return head;
    }

    private int helper(ListNode node) {
        if (node == null) return 0;

        int carry = helper(node.next);
        int doubled = node.val * 2 + carry;
        node.val = doubled % 10;
        return doubled / 10;
    }
}
