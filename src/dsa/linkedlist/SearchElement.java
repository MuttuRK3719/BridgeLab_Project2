package dsa.linkedlist;

public class SearchElement {
    int searchElement(Node head, int value) {
        int count = 0;
        if(head.value==value) return 0;
        while (head != null) {
            count++;
            if (head.value == value) return count;
            head = head.next;
        }
    return -1;
    }
}
