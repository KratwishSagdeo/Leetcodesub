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
    public ListNode[] splitListToParts(ListNode head, int k) {
        // Step 1: Count length of linked list
        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }

        // Step 2: Find base size and extra nodes
        int baseSize = n / k;   // minimum nodes per part
        int extra = n % k;      // first 'extra' parts get one more node

        // Step 3: Create result array
        ListNode[] res = new ListNode[k];
        curr = head;

        // Step 4: Split the list
        for (int i = 0; i < k; i++) {
            if (curr == null) {
                res[i] = null; // empty part
                continue;
            }

            res[i] = curr;
            int partSize = baseSize + (i < extra ? 1 : 0);

            // Traverse partSize - 1 nodes
            for (int j = 1; j < partSize; j++) {
                curr = curr.next;
            }

            // Cut the list
            ListNode nextPart = curr.next;
            curr.next = null;
            curr = nextPart;
        }

        return res;
    }
}
