package dsa.linkedlist;

public class DetectLinkedList {
    boolean detectLinkedList(Node node) {
        Node fast = node;
        Node slow = node;
        while (fast != null && fast.next != null) {
            if (fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
