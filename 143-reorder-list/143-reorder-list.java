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
        //special case: more than 2 nodes is needed;
        if(head == null || head.next == null || head.next.next == null) return;
        
        //use fast slow pointer to find the midpoint(left middle) of the Linklist
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //split the linked list into two parts, and to reverse the right part 
        ListNode prev = null;
        ListNode temp = slow.next;
        
        slow.next = null; //points the left part to null
        slow = temp;
        
        while(slow != null){
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        
        
        //merge two linkedlist
        ListNode left = head;
        ListNode right = prev;
        
        while(left != null && right != null){
            temp = left.next;
            left.next = right;
            right = right.next;
            left.next.next = temp;
            left = temp;
        }

    }
}