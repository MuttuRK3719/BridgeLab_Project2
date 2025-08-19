package dsa.linkedlist;

public class ReverseLinkedList {
    public Node reverseLinkedList(Node node) {
        Node prev = null;
        Node curr = node;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev= curr;
            curr = nextNode;
        }
        return prev;
    }
}
