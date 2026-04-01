class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;

        int n = 0;
        ListNode temp = head;

        while(temp != null){
            n++;
            temp = temp.next;
        }

        int mid = n / 2;

        temp = head;
        for(int i = 0; i < mid - 1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
