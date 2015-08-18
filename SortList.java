/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode n1 = head;
        ListNode n2 = head;
        while(n2.next != null && n2.next.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next;
        n1.next = null;
        ListNode leftlist = null, rightlist =null;
        
        if(n2 != null){
           n1 = sortList(head);
           n2 = sortList(n2);    
        }
        return mergeTwoLists(n1, n2);
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode head = l1;    	
    	if(l1 == null){
            return l2;
    	}    
        if(l2 == null){
            return l1;
        }   
        ListNode temp = null;
    	if(l1.val > l2.val){
    		head = l2;
    		l2 = l1;
    		l1 = head;
        }  
        while(l2 != null){
            if(l1.next != null){
                if(l2.val >= l1.next.val){
                    l1 = l1.next;
                }else if(l2.val >= l1.val){                
	                    temp = new ListNode(l2.val);
                		temp.next = l1.next;
	                    l1.next = temp;
	                    l1 = l1.next;
	                    l2 = l2.next;
                }
            }else{
                l1.next = l2;
                return head;
            }           
        }
        return head;
    }
}