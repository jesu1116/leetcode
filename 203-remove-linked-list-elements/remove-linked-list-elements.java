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
    public ListNode removeElements(ListNode head, int val)
    {
           ListNode temp=new ListNode(0);
           ListNode curr=temp;
           curr.next=head;
           while(curr.next!=null)
           {
            if(curr.next.val!=val)
            {
                curr=curr.next;
            }
            else
            {
                curr.next=curr.next.next;
            }
           } 
           return temp.next;   
    }
}