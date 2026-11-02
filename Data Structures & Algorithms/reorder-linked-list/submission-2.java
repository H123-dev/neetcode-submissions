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
        int size = 0;
        ListNode save = head;
        while(head!=null)
        {
            size++;
            head=head.next;
        }
        head=save;
        ListNode half = head;
        if(size%2!=0)
            size++;
        ListNode prev = null;
        for(int i = 0 ; i<size/2;i++)
        {
            prev=half;
            half=half.next;
        }
        prev.next=null;
        half = reverseList(half);
        while(half!=null)
        {
            ListNode t2 = half;
            half=half.next;
            t2.next=head.next;
            head.next=t2;
            head=t2.next;
        }
    }

        public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
