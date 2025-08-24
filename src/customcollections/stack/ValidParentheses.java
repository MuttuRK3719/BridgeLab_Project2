package customcollections.stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[(]"));
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                switch (ch) {
                    case ')' -> {
                        if (stack.pop() != '(')
                            return false;
                    }
                    case ']' -> {
                        if (stack.pop() != '[')
                            return false;
                    }
                    case '}' -> {
                        if (stack.pop() != '{')
                            return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

}
