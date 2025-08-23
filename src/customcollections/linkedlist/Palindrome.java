package customcollections.linkedlist;

public class Palindrome {
    public boolean isPalindrome(Node head) {
        Node prev = null;
        Node fast = head;
        Node slow = head;
        Node curr = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            curr.next = prev;
            prev = curr;
            curr = slow;
        }
        if (fast != null) slow = slow.next;
        while (slow != null && prev != null) {
            if (slow.value != prev.value) return false;
            slow = slow.next;
            prev = prev.next;
        }
        return slow == null;

    }
}
