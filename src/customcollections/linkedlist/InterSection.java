package customcollections.linkedlist;

public class InterSection {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node h1=head1;
        Node h2=head2;
        while(h1!=h2){
            h1=h1==null?head2:h1.next;
            h2=h2==null?head1:h2.next;
        }
        return h1;
    }
}
