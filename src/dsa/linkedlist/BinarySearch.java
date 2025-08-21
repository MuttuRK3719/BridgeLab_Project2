package dsa.linkedlist;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(11);
        list.add(13);
        list.add(15);
        list.add(17);
        list.add(21);
        System.out.println(binarySearch(list.head, 101));

    }

    public static int binarySearch(Node list, int target) {
        Node start = list;
        Node end = null;
        while (start != end) {
            Node middle = getMiddle(start, end);
            if (middle == null) break;
            System.out.println(middle.value);
            if (middle.value == target) return middle.value;
            else if (middle.value > target) {
                end = middle;
            } else {
                start = middle.next;
            }
        }
        return -1;
    }

    public static Node getMiddle(Node start, Node end) {
        if (start == null) return null;
        Node fast = start;
        Node slow = start;
        while (fast != end && fast.next != end) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
