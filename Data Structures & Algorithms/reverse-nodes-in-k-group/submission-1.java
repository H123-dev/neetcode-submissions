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

 


 //CLEANSER VERSION

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int l = size(head);
        if(head==null||l<k || k==1)
            return head;
        int itr = l/k;
        ListNode main = new ListNode(-1);
        ListNode slave = main;
        for(int i = 1 ; i<=itr ; i++)
        {
            ListNode s = head;
            ListNode prev = null;
            for(int j = 1 ; j<=k-1 ;j++)
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
            slave.next = prev;
            slave = s;
        }
        slave.next = head;
        return main.next;

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
