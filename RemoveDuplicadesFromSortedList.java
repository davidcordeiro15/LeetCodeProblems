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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = new ListNode();
        ListNode current = list;
        if (head == null) return null;
        while (head != null){
            if (current == list || current.val != head.val){
                current.next = new ListNode(head.val); // Crai-se um novo  nódulo
                current = current.next;
            } 
            head = head.next; 
    
        }
        return list.next; 
    }
}
