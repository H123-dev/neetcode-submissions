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
        ListNode prev = null;
        ListNode save = head;
        while(head!=null)
        {
            if(head.next==null)
            {
                ListNode t = save.next;
                if(t==null || t==head)
                    return ;
                head.next =t;
                save.next = head;
                prev.next=null;
                prev = head;
                head = t;
                save = t;
            }
            else
            {
                prev = head;
                head = head.next;
            }
        }
    }
}
