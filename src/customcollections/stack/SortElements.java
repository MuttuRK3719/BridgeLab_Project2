package customcollections.stack;

import java.util.Stack;

public class SortElements {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        sort(stack);
        System.out.println(stack);
    }

    static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int temp = stack.pop();
        sort(stack);
        insert(stack,temp);
    }

    static void insert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() > element) {
            stack.push(element);
            return;
        }
            int temp = stack.pop();
            insert(stack, element);
            stack.push(temp);

    }
}
