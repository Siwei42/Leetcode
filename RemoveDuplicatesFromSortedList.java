/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode n1 = head;
        if(head == null){
            return null;
        }else{
            ListNode n2 = head.next;
            while(n2 != null){
                if(n1.val == n2.val){
                    n1.next = n2.next;
                    n2 = n2.next;
                }else{
                    n1 = n1.next;
                    n2 = n2.next;
                }
            }
        }
        return head;
    }
}