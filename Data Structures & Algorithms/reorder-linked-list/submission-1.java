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
    public void reorderList(ListNode head) {
        // [2,4,6,8,10]

        // 2->4->6 null<-8<-10;

        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }

        ListNode mid = s;
        ListNode prev = null;
        ListNode curr = mid.next;
        mid.next = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 2->4->6->null<-8<-10;

        // System.out.println(prev.val);
        // System.out.println(head.val);

        ListNode dummy = new ListNode();
        ListNode l = head;
        ListNode r = prev;
        ListNode k = dummy;

        while(l != null && r != null) {
            ListNode ln = l.next;
            k.next = l;
            k.next.next = r;
            l = ln;
            r = r.next;
            k = k.next.next;
        }

        k.next = l != null ? l : r;

        head = dummy.next;
    }
}
