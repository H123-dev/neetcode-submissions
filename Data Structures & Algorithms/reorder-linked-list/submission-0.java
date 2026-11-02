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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)
            return ;
        ListNode save = head; 
        ListNode prev = null;
        while(head.next!=null)
        {
            prev=head;
            head=head.next;
        }
        prev.next=null;
        head.next=save.next;
        save.next=head;
        reorderList(head.next);
    }
}
