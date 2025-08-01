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
    public ListNode reverseList(ListNode head) {
        ListNode last = new ListNode(); 
        last = null; 

        if (head == null) return head; 
        
        while (head != null) {
            ListNode newNode = new ListNode(); 
            newNode.val = head.val; 
            if (last != null) {
                newNode.next = last; 
            }
            last = newNode; 
            head = head.next; 
        }

        return last; 
    }
}
