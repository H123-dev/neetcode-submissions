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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = new ListNode(-1);
        ListNode slave = r;
        boolean plus = false;
        while(l1!=null&&l2!=null)
        {
            int dig1 = l1.val;
            int dig2 = l2.val;
            int sum = dig1+dig2;
            if(plus)
            {
                plus=false;
                sum+=1;
            }
            if(sum>=10)
            {   
                sum = sum-10;
                plus=true;
            }
            slave.next = new ListNode(sum);
            slave = slave.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(l2!=null&&l1==null)
            l1=l2;
        while(l1!=null)
        {
            int sum = l1.val;
            if(plus)
            {
                sum+=1;
                plus=false;
            }
            if(sum>=10)
            {
                sum-=10;
                plus=true;;
            }
            slave.next = new ListNode(sum);
            slave = slave.next;            
            l1=l1.next;
        }
        if(plus)
            slave.next = new ListNode(1);
        return r.next;
    }
}
