package dsa.queue1;

import java.util.*;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 0, 5};
        System.out.println(Arrays.toString(maxSlidingWindow1(arr, 3)));
    }

    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        QueueUsingStack<Integer> queue = new QueueUsingStack<>();
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max] || i - k + 1 > max) {
                max = i;
            }
            if (i >= k - 1)
                list.add(nums[max]);
        }
        return list;

    }

    public static int[] maxSlidingWindow1(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (!dq.isEmpty() && i >= k - 1) {
                result[i - k +1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}
