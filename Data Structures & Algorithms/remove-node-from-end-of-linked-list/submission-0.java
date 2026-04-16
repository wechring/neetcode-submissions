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

        ListNode l = new ListNode ();
        l.next = head;
        ListNode h = l;
        ListNode r = head;

        for(int i = 0; i < n; i++){
            r = r.next;
        }

        while(r != null){
            r = r.next;
            l = l.next;
        }

        if(l.next != null){
            l.next = l.next.next;
        } else{
            l.next = null;
        }

        return h.next;
    }
}
