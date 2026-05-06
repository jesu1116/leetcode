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
    //     if (lists == null || lists.length == 0) {
    //         return null;
    //     }

    //     while (lists.length > 1) {
    //         List<ListNode> temp = new ArrayList<>();
    //         for (int i = 0; i < lists.length; i += 2) {
    //             ListNode l1 = lists[i];
    //             ListNode l2 = i + 1 < lists.length ? lists[i + 1] : null;
    //             temp.add(mergeLists(l1, l2));
    //         }
    //         lists = temp.toArray(new ListNode[0]);
    //     }

    //     return lists[0];        
    // }

    // private ListNode mergeLists(ListNode l1, ListNode l2) {
    //     ListNode node = new ListNode();
    //     ListNode ans = node;

    //     while (l1 != null && l2 != null) {
    //         if (l1.val > l2.val) {
    //             node.next = l2;
    //             l2 = l2.next;
    //         } else {
    //             node.next = l1;
    //             l1 = l1.next;
    //         }
    //         node = node.next;
    //     }

    //     node.next = l1 != null ? l1 : l2;
    //     return ans.next;
     PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add first node of every list
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {

            ListNode minNode = pq.poll();

            tail.next = minNode;
            tail = tail.next;

            // Add next node
            if (minNode.next != null) {
                pq.add(minNode.next);
            }
        }

        return dummy.next;
    }
}