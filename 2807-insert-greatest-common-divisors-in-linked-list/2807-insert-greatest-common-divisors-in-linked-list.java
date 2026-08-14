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
    public int gcd(int a ,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public void helper(ListNode node){
        if(node ==null)return;
        ListNode slow = node;
        ListNode fast= node.next;

        while(slow!= null && fast!= null){
            int a = slow.val;
            int b = fast.val;
            int gcd = gcd(a,b);
            ListNode g = new ListNode(gcd);
            slow.next = g;
            g.next = fast;
            slow = fast;
            fast = fast.next;
        }
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        helper(head);
        return head;
    }
}