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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        if(list1.val>list2.val)
        {
            ListNode t = list1;
            list1 = list2;
            list2 = t;
        }
        ListNode s = list1;
        ListNode prev1 = null;
        while(list1!=null&&list2!=null)
        {
            if(list1.val>list2.val)
            {
                ListNode t = list2;
                list2=list2.next;
                t.next=list1;
                prev1.next = t;
                prev1=t;
                
            }
            else
            {
                prev1 = list1;
                list1=list1.next;
            }
        }
        if(list2!=null)
            prev1.next = list2;
        return s;
    }
}