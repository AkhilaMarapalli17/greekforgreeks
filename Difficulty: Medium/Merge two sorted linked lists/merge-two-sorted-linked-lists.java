/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    
    public Node sortedMerge(Node head1, Node head2) {
        // If one list is empty, return the other
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        
   
        Node dummy = new Node(0);
        Node tail = dummy;
        
        // Compare and merge
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
      
        if (head1 != null) {
            tail.next = head1;
        }
        if (head2 != null) {
            tail.next = head2;
        }
        
        return dummy.next;
    }
}


