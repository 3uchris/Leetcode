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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode prev = new ListNode(-1);
        ListNode curr = prev;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val; //if l1 == null, then x = 0, else x = l1.val
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            
            carry = sum / 10;               // sum > 10 then carry == 1
            sum = sum % 10;                // eg sum = 19, 19 % 10 = 1.....9
            
            curr.next = new ListNode(sum);      //new node for sum val
            
            curr = curr.next;                 //curr moves forward
            if(l1 != null) l1 = l1.next;      //if l1 is not null, move one postion right ward
            if(l2 != null) l2 = l2.next;
        }
        
        if(carry == 1) curr.next = new ListNode(carry); 
        
        return prev.next;
    }
}