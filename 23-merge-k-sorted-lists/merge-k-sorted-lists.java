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
    public ListNode mergeKLists(ListNode[] lists) {
  
    //  PriorityQueue<ListNode> pq =
    //         new PriorityQueue<>((a, b) -> a.val - b.val);

        
    //     for (ListNode node : lists) {
    //         if (node != null) {
    //             pq.add(node);
    //         }
    //     }

    //     ListNode dummy = new ListNode(0);
    //     ListNode tail = dummy;

    //     while (!pq.isEmpty()) {

    //         ListNode minNode = pq.poll();

    //         tail.next = minNode;
    //         tail = tail.next;

    //         // Add next node
    //         if (minNode.next != null) {
    //             pq.add(minNode.next);
    //         }
    //     }

    //     return dummy.next;
    PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
    for(ListNode node:lists)
      {
        if(node!=null)
        {

           pq.add(node);
        }
      }
      ListNode dummy=new ListNode(0);
      ListNode tail=dummy;
      while(!pq.isEmpty())
      {
        ListNode minnode=pq.poll();
        tail.next=minnode;
        tail=tail.next;
        if(minnode.next!=null)
        {
            pq.add(minnode.next);
        }
      }
      return dummy.next;
    }
}