package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode n1 = head;      
        ListNode n2 = head;
        ListNode temp1 = null;
        ListNode temp2 = null;
        
        while(n2.next != null && n2.next.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next;
        n1.next = null;
        n2 = reverseList(n2);
        n1 = head;
        while(n2 != null){
            temp1 = n1.next;
            temp2 = n2.next;
            n2.next = temp1;
            n1.next = n2;
            n1 = temp1;
            n2 = temp2;
        }
    }
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = new ListNode(-1);
        newhead.next = head;
        ListNode n1 = head;
        ListNode n2 = head.next;
        while(n2 != null){
            n1.next = n2.next;
            n2.next = newhead.next;
            newhead.next = n2;
            n2 = n1.next;
        }
        return newhead.next;
    }
}