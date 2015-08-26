package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesFromSortedListII  {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = new ListNode(-1);
        newhead.next = head;
        ListNode n1 = newhead;
        ListNode n2 = head.next;
        int flag = 0; 
        while(n2 != null){
            if(n1.next.val == n2.val){
                n2 = n2.next;
                flag = 1;
            }else { 
	            if(flag == 1){
	            	n1.next = n2;
	                flag = 0;
	                n2 = n2.next;
	            }else if(flag == 0){    
	            n1 = n1.next;
	            n2 = n2.next;
	            }
            }
        }
        if(flag == 1){
        	n1.next = null;
        }    
        return newhead.next;
    }
}