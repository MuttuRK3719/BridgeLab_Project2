package dsa.queue1;

import java.util.ArrayDeque;
import java.util.Deque;

public class FirstUniqueChars {
    public static void main(String[] args) {
        System.out.println(replaceUnique("aabc"));
    }

    static String replaceUnique(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!dq.isEmpty() && dq.peekFirst() == ch) {
                dq.pollFirst();
            } else {
                dq.offerLast(ch);
            }
            if (!dq.isEmpty())
                sb.append(dq.peekFirst());
            else sb.append(-1);
        }
        return sb.toString();
    }
}
