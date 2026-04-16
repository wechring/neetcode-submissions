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
    public ListNode middleNode(ListNode head) {
        ListNode lag = head;
        ListNode lead = head;

        while(lead != null && lead.next != null){
            lag = lag.next;
            lead = lead.next.next;
        }

        return lag;
    }
}