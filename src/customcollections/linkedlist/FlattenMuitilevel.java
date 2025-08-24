package customcollections.linkedlist;

import java.util.Stack;

public class FlattenMuitilevel {
    public Node flatten(Node head) {
        if (head == null)
            return null;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            prev.next = curr;
            curr.prev = prev;
            if (curr.next != null) {
                stack.push(curr.next);
            }
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }
            prev = curr;
        }
        dummy.next.prev = null;
        return dummy.next;
    }

    public Node flattenSpaceOptimization(Node head) {
        Node temp = head;
        while (temp != null) {
            Node t = temp.next;
            if (temp.child != null) {
                Node c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                while (c.next != null) {
                    c = c.next;
                }
                c.next = t;
                if (t != null) {
                    t.prev = c;
                }
            }
            temp.child = null;
            temp = t;
        }
        return head;
    }
}
