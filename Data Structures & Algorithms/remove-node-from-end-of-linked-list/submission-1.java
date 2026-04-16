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
        ListNode lag = head;
        ListNode lead = head;

        for(int i = 0; i < n; i++){
            lead = lead.next;
        }

        if(lead == null){
            return head.next;
        }

        while(lead.next != null ){
            lag = lag.next;
            lead = lead.next;
        }

        lag.next = lag.next.next;

        return head;
    }
}
