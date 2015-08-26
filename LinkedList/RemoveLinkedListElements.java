package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newhead = new ListNode(-1);
        newhead.next = head;
        ListNode n1 = newhead;
        ListNode n2 = head;
        while(n2 != null){
            if(n2.val == val){
                n1.next = n2.next;
                n2 = n2.next;
            }else{
                n1 = n1.next;
                n2 = n2.next;
            }
        }
        return newhead.next;
    }
}