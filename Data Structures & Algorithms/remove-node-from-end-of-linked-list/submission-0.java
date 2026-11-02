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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode s = head;
        while(head!=null)
        {
            size++;
            head=head.next;
        }
        if(n==size)
            return s.next;
        head=s;
        for(int i = 0; i<size-n-1 ;i++)
        {
            head=head.next;
        }
        head.next=head.next.next;
        return s;
    }
}
