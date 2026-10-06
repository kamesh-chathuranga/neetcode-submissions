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
        ListNode p = head;
        ListNode curr = head;
        int length = 0;

        while(curr != null) {
            length++;
            curr = curr.next;
        }

        //  System.out.println(length);

        for(int i = 0; i < length - n - 1; i++) {
            p = p.next;
        } 

        // System.out.println(p.val);

        if(length == n) {
            head = head.next;
        } else {
            p.next = p.next.next;
        }

        return head;
    }
}
