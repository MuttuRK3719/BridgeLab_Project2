package dsa.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

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

    void display(Node<T> temp) {
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");

    }
}
