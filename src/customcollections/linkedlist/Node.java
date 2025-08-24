package customcollections.linkedlist;

public class Node<T> {
    T value;
    Node next;
    Node prev;
    Node child;
    Node(T value) {
        this.value = value;
    }
}
