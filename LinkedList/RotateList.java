package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode n1 = head;
        ListNode n2 = head;
        int length = 0;
        while(n1 != null){
            n1 = n1.next;
            length++;
        }
        k = k % length;
        if(k == 0)
         return head;
        n1 = head;
        int count = 0;
        while(n2 != null){
            if(count == k)
                break;
            else
                n2 = n2.next;
                count++;
        }
        while(n2.next != null){
            n1 = n1.next;
            n2 = n2.next;
        } 
        n2.next = head;
        n2 = n1.next;
        n1.next = null;
        return n2;
    }
}