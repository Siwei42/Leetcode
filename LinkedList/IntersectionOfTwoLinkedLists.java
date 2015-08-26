package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        int gap = Math.abs(len1-len2);
        ListNode n1 = headA;
        ListNode n2 = headB;
        for (int i = 1; i <= (len1+len2+gap)/2; i++){
            if(i > gap){
                if(n1 == n2)
                    return n1;
                n1 = n1.next;
                n2 = n2.next;
            }
            else if(len1 >= len2)    
                n1 = n1.next;
            else if(len1 < len2)    
                n2 = n2.next; 
        }
        return null;        
    }
    public int getLength(ListNode head){
        int i=0;
        while(head != null){
            head = head.next; 
            i++;
        }
        return i;
    }
}