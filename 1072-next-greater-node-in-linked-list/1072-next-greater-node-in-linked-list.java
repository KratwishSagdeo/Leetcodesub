class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode h = head;
        while (h != null) {
            n++;
            h = h.next;
        }

        int[] result = new int[n];
        h = head;
        int i = 0;

        while (h != null) {
            int val = h.val;
            ListNode t1 = h.next;

            while (t1 != null) {
                if (t1.val > val) {
                    result[i] = t1.val;
                    break;
                }
                t1 = t1.next;
            }
            i++;
            h = h.next;
        }

        return result;
    }
}
