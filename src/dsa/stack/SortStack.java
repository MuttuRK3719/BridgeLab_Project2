package dsa.stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(6);
        stack.push(1);
        stack.push(10);
        stack.push(-1);
        sort(stack);
        System.out.println(stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        sort(stack);
        sort(stack, temp);
    }

    static void sort(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() > value) {
            stack.push(value);
            return;
        } else {
            int temp = stack.pop();
            sort(stack, value);
            stack.push(temp);
        }
    }

}
