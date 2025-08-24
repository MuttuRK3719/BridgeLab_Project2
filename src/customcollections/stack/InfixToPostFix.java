package customcollections.stack;

import java.util.Stack;

class InfixToPostFix {
    public static void main(String[] args) {
        System.out.println(infixToPostFix("(A+B)*C"));//AB+C*
        System.out.println(infixToPostFix("A+B*C"));//ABC*+

    }

    static String infixToPostFix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append(ch);
            } else {
                if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(ch);
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());

        }
        return sb.toString();
    }
}
