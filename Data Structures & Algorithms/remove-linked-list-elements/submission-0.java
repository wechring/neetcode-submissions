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
    public ListNode removeElements(ListNode head, int val) {
        // 1. Create the dummy node and attach it to the front
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val == val) {
                // We found a target! Bypass it.
                // Notice we DO NOT move 'prev' here. It stays put to check the next node.
                prev.next = cur.next;
            } else {
                // This node is safe. We can advance 'prev'.
                prev = cur;
            }
            
            // We ALWAYS advance 'cur' to keep exploring the list
            cur = cur.next;
        }
        
        // 2. The Dummy Node Guarantee: dummy.next is always the correct head
        return dummy.next;
    }
}