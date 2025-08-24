package customcollections.linkedlist;

public class CloneLinkedList<T> {
    static class Node<T> {
        T val;
        Node next;
        Node random;

        public Node(T val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    Node head;
    Node tail;

    public static void main(String[] args) {
        CloneLinkedList<Integer> cloneLinkedList = new CloneLinkedList();
        cloneLinkedList.add(10);
        cloneLinkedList.add(20);
        cloneLinkedList.add(30);
        cloneLinkedList.add(40);
        cloneLinkedList.add(50);
        cloneLinkedList.add(60);
        cloneLinkedList.display(cloneLinkedList.head);
        Node<Integer> cloneH = cloneLinkedList.copyRandomList(cloneLinkedList.head);
        cloneLinkedList.display(cloneH);
    }

    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node curr = head;
        while (curr != null) {
            Node clone = new Node(curr.val);
            clone.next = curr.next;
            curr.next = clone;
            curr = clone.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node cloneHead = head.next;
        Node currCopy = cloneHead;
        while (curr != null) {
            curr.next = curr.next.next;
            if (currCopy.next != null) {
                currCopy.next = currCopy.next.next;
            }
            curr = curr.next;
            currCopy = currCopy.next;
        }
        return cloneHead;
    }

    void display(Node temp) {
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    void add(T val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
            return;
        }
        Node<T> n = new Node(val);
        tail.next = n;
        tail = n;
    }
}
