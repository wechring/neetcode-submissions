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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode prev = new ListNode() ;
        prev.next = l1;
        ListNode first = prev;
        ListNode l2 = list2;
        ListNode temp;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                l1 = l1.next;
                prev = prev.next;
            } else{
                temp = l2.next;
                prev.next = l2;
                l2.next = l1;
                l2 = temp;
                prev = prev.next;
            }

        }

        if(l1 == null && l2 != null){
            prev.next = l2;
        }

        return first.next;
    }
}