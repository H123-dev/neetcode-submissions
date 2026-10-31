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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode s = head;
        ListNode prev = null;
        while(s.next!=null)
        {
            prev = s;
            s=s.next;
        }
        prev.next = null;
        head= reverseList(head);
        return new ListNode(s.val,head);

    }
}
