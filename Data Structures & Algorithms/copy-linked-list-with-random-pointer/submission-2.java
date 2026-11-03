/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) 
            return null;
        Node s= head;
        while(head!=null)
        {
            Node copy = new Node(head.val);
            copy.next = head.next;
            head.next = copy;
            head = copy.next;
        }
        head=s;
        while(head!=null&&head.next!=null)
        {
            if(head.random!=null)
                head.next.random = head.random.next;
            head=head.next.next;
        }
        s=s.next;
        head= s;
        while(head.next!=null)
        {
            head.next=head.next.next;
            head=head.next;
        }
        return s;
    }
}
