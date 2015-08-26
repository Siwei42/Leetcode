package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newhead = new ListNode(-1);
        newhead.next = head;
        if(head == null || head.next == null)
            return head;
    
        ListNode previousNode = newhead;
        ListNode node1 = null; 
        ListNode node2 = null;
        for(int i = 0 ; i < n; i++){
        	if(i < m-1)
        		previousNode = previousNode.next;
        	else if(i == m-1){
        		node1 = previousNode.next;
        		node2 = node1.next;
        	}
        	else {
        	    node1.next = node2.next;
        	    node2.next = previousNode.next;
        	    previousNode.next = node2;
        	    node2 = node1.next;
        	}

        }       
        return newhead.next;
    }
}