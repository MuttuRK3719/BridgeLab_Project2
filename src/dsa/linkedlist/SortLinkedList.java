package dsa.linkedlist;

public class SortLinkedList {
    MergeLinkedList mergeLinkedList = new MergeLinkedList();

    Node sortLists(Node head) {
        if (head == null || head.next == null) return head;
        Node middle = middle(head);
        Node left = sortLists(head);
        Node right = sortLists(middle);
        return mergeLinkedList.mergeList(left, right);
    }

    Node middle(Node head) {
        Node fast = head;
        Node slow = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow == null ? head : slow.next;
        }
        Node middle = slow.next;
        slow.next = null;
        return middle;
    }
}
