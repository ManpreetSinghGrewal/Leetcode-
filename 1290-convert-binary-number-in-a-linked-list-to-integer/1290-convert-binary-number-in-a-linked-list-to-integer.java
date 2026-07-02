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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int n = 0;
        int s = 0;
        while(temp!= null){
            temp = temp.next;
            s++;
        }
        int arr[] = new int[s];
        temp = head;
        int i =0;
        while(temp != null){

            arr[i++] = temp.val;
            temp = temp.next;
        }
        int power = 0;
        int res = 0;
        for(int j = s-1;j>=0;j--){
            res+= arr[j] * Math.pow(2,power);
            power++;
        }
        return res;
    }
}