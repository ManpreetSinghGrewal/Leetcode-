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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int nc= 1;
        // ListNode temp = head;
        // while(temp.next != null){
        //     nc++;
        //     temp = temp.next;
        // }
        // if(n == nc){
        //     return head.next;
        // }
        // if(n>nc){
        //     return null;
        // }
        // int t = nc-n-1;
        // temp = head;
        // while(t>0){
        //     temp = temp.next;
        //     t--;
        // }
        // temp.next = temp.next.next;
        // return head;
          ListNode  current = head;
          int l = 0;
          while(current != null){
            l++;
            current = current.next;
          }
          if(n == l){
            head = head.next;
            return head;
          }
          current = head;
          for(int i =0;i<l-n-1;i++){
            current = current.next;
          }
          current.next = current.next.next;
          return head;
    }
}