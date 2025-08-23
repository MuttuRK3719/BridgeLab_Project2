package customcollections.linkedlist;

public class DetectCyclic {
    Node detectCylicHead(Node list) {
        // code here
        Node fast = list;
        Node slow = list;
        int count = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                count++;
                slow = slow.next;
                while (slow != fast) {
                    slow = slow.next;
                    count++;
                }
                break;
            }
        }
        if (count == 0) return null;
        Node ahead = list;
        Node start = list;
        while (count > 0) {
            ahead = ahead.next;
            count--;
        }
        while (ahead != start) {
            ahead = ahead.next;
            start = start.next;
        }
        return start;
    }
}
