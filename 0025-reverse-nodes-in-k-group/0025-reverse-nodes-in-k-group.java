class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;

        // Count total nodes
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;

        while (count >= k) {
            ListNode prev = null;
            curr = prevGroup.next;
            ListNode tail = curr;

            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect with previous part
            prevGroup.next = prev;
            tail.next = curr;

            prevGroup = tail;
            count -= k;
        }

        return dummy.next;
    }
}