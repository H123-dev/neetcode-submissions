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
    public ListNode reverseKGroup(ListNode head, int k) {
        int l = size(head);
        if(head==null||l<k || k==1)
            return head;
        int itr = l/k-1;
        ListNode prev = null;
        ListNode s = head;
        for(int i = 1 ; i<=k-1 ;i++)
            head=head.next;
        ListNode t = head.next;
        head.next = null;
        head = t;
        ListNode curr = s;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode main = prev;
        while(prev.next!=null)
            prev=prev.next;
        ListNode slave = prev;
        for(int i = 1 ; i<=itr ; i++)
        {
            s = head;
            prev = null;
            for(int j = 1 ; j<=k-1 ;j++)
                head=head.next;
            t = head.next;
            head.next = null;
            head = t;
            curr = s;
            while (curr != null) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            slave.next = prev;
            while(prev.next!=null)
                prev=prev.next;
            slave = prev;
        }
        slave.next = head;
        return main;

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

    public int size (ListNode h)
    {
        ListNode t = h;
        int c = 0;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        return c;
    }
}
