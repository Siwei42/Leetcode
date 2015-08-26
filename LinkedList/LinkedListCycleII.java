package LinkedList;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode n1 = head;
        ListNode n2 = head;
        while(n2.next != null && n2.next.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
            if(n1 == n2){
                n2 = head;
                while(n2 != n1){
                    n1 = n1.next;
                    n2 = n2.next;
                }
                return n1;
            }
        }
        return null;
    }
}