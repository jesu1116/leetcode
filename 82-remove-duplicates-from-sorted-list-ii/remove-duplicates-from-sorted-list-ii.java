/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head==null)
        {
            return head;
        }
        ListNode prev=new ListNode(0);
        ListNode dummy=prev;
        dummy.next=head;

        ListNode current=head;
        while(current!=null&&current.next!=null)
        {
            if(current.val==current.next.val)
            {
                while(current.next!=null&&current.val==current.next.val)
                {
                    current=current.next;
                }
                dummy.next=current.next;
            }
            else
            {
                dummy =dummy.next;;
            }
            current=current.next;
        }
        return prev.next;

        
    }
}