package dsa.stack;

import java.util.*;

public class SortArrayUsingStack {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 3, 2, -1, -2};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (stack.peek() < arr[i]) {
                stack.push(arr[i]);
            } else sortStack(arr[i], stack);
        }
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            arr[index--] = stack.pop();
        }
        return arr;
    }

    static void sortStack(int value, Stack<Integer> stack) {
        if (stack.isEmpty() || stack.peek() < value) {
            stack.push(value);
            return;
        }
        if (!stack.isEmpty()) {
            int k = stack.pop();
            sortStack(value, stack);
            stack.push(k);
        }
    }
}
