package dsa.stack;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }

    static int[] nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                stack.pop();
            }
            int k = arr[i];
            arr[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(k);

        }
        return arr;
    }
}
