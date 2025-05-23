class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(0);
        ListNode current = list; 
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                current.next = list1;
                list1 = list1.next; 
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; 
            if (list1 != null) {
                current.next = list1;
            }
            if (list2 != null) {
                current.next = list2;
            }
        
        }
        return list.next; 

    }
}
/*
LinkedList
-> She has the same ArrayList methods 
-> The list is storage by containers
-> Which container is linked in the first container and the next
-> The "next" term in a container represent the next node, not the number node, but the "head"
-> To insert a new node we need to set the head of last node and a new data
  -> The params to insert a new node:
      -> The last node or the last list,
      -> A data to storage */
