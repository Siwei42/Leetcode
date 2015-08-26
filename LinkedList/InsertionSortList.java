package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = new ListNode(-1);
        newhead.next = null;
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            pre = newhead;
            while(pre.next != null && cur.val > pre.next.val){
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        return newhead.next;
    }
}