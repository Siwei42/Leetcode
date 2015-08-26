package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SwapNodesInPairs  {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = new ListNode(-1);
        newhead.next = head;
        ListNode n1 = newhead;
        ListNode n2 = head;
        ListNode temp = null;
        while(n2 != null && n2.next != null){
            temp = n2.next.next;
            n1.next = n2.next;
            n2.next.next = n2;
            n2.next = temp;
            n1 = n1.next.next;
            n2 = temp;
        }
        return newhead.next;
    }
}