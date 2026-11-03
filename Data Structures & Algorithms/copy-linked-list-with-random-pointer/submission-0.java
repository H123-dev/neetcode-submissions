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
        HashMap<Node,Integer> indexes = new HashMap<>();
        HashMap<Integer,Node> indexes2 = new HashMap<>();
        int i = 0;
        Node h = new Node(-1);
        Node slave = h;
        Node s = head;
        while(head!=null)
        {
            Node crr = new Node(head.val);
            slave.next = crr;
            slave = crr;
            indexes.put(head,i);
            indexes2.put(i,crr);
            i++;
            head=head.next;
        }
        i=0;
        while(s!=null)
        {
            if(s.random!=null)
                indexes2.get(i).random = indexes2.get(indexes.get(s.random));
            s=s.next;
            i++;
        }
        return h.next;



    }
}
