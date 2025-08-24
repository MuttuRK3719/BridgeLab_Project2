package customcollections.stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        reverseStack(stack);
        System.out.println(stack);
    }

    static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int temp = stack.pop();
        reverseStack(stack);
        stack.push(temp);
    }
}
