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
        if(head == null || head.next == null || head.next.next == null) return;
        
        //step 1: make pointer "slow" points at the midpoint or left-mid(even num) of the Linkedlist
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //step 2: split two linkedlists at the midpoint, and reverse the right part
        ListNode prev = null;
        ListNode temp = slow.next;
        slow.next = null;
        slow = temp;
        
        while(slow != null){
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        
        
        ListNode head_left = head;
        ListNode head_right = prev;
        
        while(head_left != null && head_right != null){
            temp = head_left.next;
            head_left.next = head_right;
            head_right = head_right.next;
            head_left.next.next = temp;
            head_left = temp;
        }

    }
}