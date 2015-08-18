/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNodeFromEndofList  {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
			return null;
		}
		ListNode n1 = head;
        ListNode n2 = head;
        for(int i=0; i<n; i++){
        	n1 = n1.next;
        }
        if(n1 == null){
        	head = head.next;
        	return head;
        }
        	
        while (n1.next != null){            
            n1 = n1.next;
            n2 = n2.next;
        }
        n2.next = n2.next.next;
        return head;
    }
}