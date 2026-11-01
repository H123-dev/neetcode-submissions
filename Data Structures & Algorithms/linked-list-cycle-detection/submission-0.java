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
    public boolean hasCycle(ListNode head) {
        ListNode head2 = head;
        while(head2!=null&&head2.next!=null)
        {
            head=head.next;
            head2=head2.next.next;
            if(head==head2)
                return true;
        }
        return false;
    }
}
