/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode list1 = new ListNode(-1);
        ListNode list2 = new ListNode(-1);
        ListNode list1head = list1;
        ListNode list2head = list2;
        while(head != null){
            if(head.val >= x){
                list1.next = head;
                list1 = list1.next;
            }    
            else{
                list2.next = head;
                list2 = list2.next;
            }  
            head = head.next;
        }
        list1.next = null;
        list2.next = list1head.next;
        return list2head.next;
    }
}