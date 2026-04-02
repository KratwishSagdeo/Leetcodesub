public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = 0, n = 0;

        ListNode temp = headA;
        while (temp != null) {
            m++;
            temp = temp.next;
        }

        temp = headB;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        int diff = Math.abs(m - n);

        if (m > n) {
            while (diff-- > 0) temp1 = temp1.next;
        } else {
            while (diff-- > 0) temp2 = temp2.next;
        }

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }
}
