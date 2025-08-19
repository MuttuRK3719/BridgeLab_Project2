package dsa.linkedlist;

public class LinkedList {
    Node head;
    Node tail;

    void add(int val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
            return;
        }
        Node n = new Node(val);
        tail.next = n;
        tail = n;
    }

    void display(Node temp) {
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");

    }
}
