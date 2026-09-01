class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode curr = list1;
        ListNode currr = list2;

        ListNode head = null;
        ListNode tail = null;

        while (curr != null && currr != null) {

            ListNode temp;

            if (curr.val <= currr.val) {
                temp = curr;
                curr = curr.next;
            } else {
                temp = currr;
                currr = currr.next;
            }

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
        }

        // If list1 still has nodes
        if (curr != null) {
            if (head == null) {
                head = curr;
            } else {
                tail.next = curr;
            }
        }

        // If list2 still has nodes
        if (currr != null) {
            if (head == null) {
                head = currr;
            } else {
                tail.next = currr;
            }
        }

        return head;
    }
}