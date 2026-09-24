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
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode rest = res;
        int sum = 0;
        ListNode temp = head.next;

        while(temp != null){
            if(temp.val == 0){
                rest.next = new ListNode(sum);
                sum = 0;
                rest = rest.next;
            }
            else if(temp.val!= 0){
                sum+=temp.val;
            }
            temp = temp.next;
        }
        return res.next;
    }
}