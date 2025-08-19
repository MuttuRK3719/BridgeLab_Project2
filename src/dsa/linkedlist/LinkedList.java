package dsa.linkedlist;

public class LinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.display();
        ReverseLinkedList list = new ReverseLinkedList();
        Node node = list.reverseLinkedList(ll.head);
        MergeLinkedList mergeLinkedList=new MergeLinkedList();
        ll.display(node);
    }

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
