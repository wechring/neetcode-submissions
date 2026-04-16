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
        if (head == null || head.next == null) return;

        // STEP 1: Find the middle
        ListNode slow = head;
        ListNode fast = head;
        
        // This safe condition prevents out-of-bounds errors
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // STEP 2: Reverse the second half
        // The second half starts immediately after 'slow'
        ListNode secondHalf = reverseList(slow.next);
        
        // CRITICAL: Cut the string! Sever the first half from the second half.
        // If you don't do this, you get an infinite cycle.
        slow.next = null; 

        // STEP 3: Merge the two halves (The Zipper)
        ListNode firstHalf = head;
        
        // We only need to check secondHalf because it will always be equal to 
        // or one node shorter than firstHalf
        while (secondHalf != null) {
            // Save the next nodes before we overwrite our current pointers
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            // Zip them together
            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            // Move both pointers forward to the next pair
            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    // Standard helper function that returns the NEW head of the reversed list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            
            prev = current;
            current = nextNode;
        }

        return prev; 
    }
}

