package customcollections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args) {
    int []arr={2,1,3,1,2,4,9};
        System.out.println(maxElement(arr,3));
    }

    static List<Integer> maxElement(int[] arr, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!deque.isEmpty() && deque.peek() < i - k) {
                deque.poll();
            }
            while (!deque.isEmpty() && arr[deque.peek()] < arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                if (!deque.isEmpty()) {
                    list.add(arr[deque.peek()]);
                } else {
                    list.add(0);
                }
            }
        }
        return list;
    }

}
