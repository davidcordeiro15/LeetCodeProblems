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
    public int getDecimalValue(ListNode head) {
        String binary = ""; 

        if (head.next == null) {
            return head.val; 
        }

        while (head != null) {
            binary = binary + Integer.toString(head.val); 

            head = head.next; 
        }

        return Integer.parseInt(binary, 2); 
        // return binary.length(); 
    }
}
