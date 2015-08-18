/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newhead = new ListNode(-1);
        newhead.next = head;
        if(head == null || head.next == null)
            return head;
    
        ListNode node1 = head; 
        ListNode node2 = head.next;
        
        while(node2 != null){
    	    node1.next = node2.next;
    	    node2.next = newhead.next;
    	    newhead.next = node2;
    	    node2 = node1.next;
        }       
        return newhead.next;
    } 
}