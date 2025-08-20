package dsa.stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                System.out.println(i);
                switch (ch) {

                    case ')' -> {
                        if (stack.isEmpty() || stack.peek() != '(') return false;
                    }
                    case '}' -> {
                        if (stack.isEmpty() || stack.peek() != '{') return false;
                    }
                    case ']' -> {
                        if (stack.isEmpty() || stack.peek() != '[') return false;
                    }
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
