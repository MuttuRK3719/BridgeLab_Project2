package dsa.stack;

public class PostFixOperation {
    public static void main(String[] args) {
        String s = "231*+9-";
        System.out.println(prefix(s));
    }

    static int prefix(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                stack.push(ch - '0');
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = 0;
                switch (ch) {
                    case '-' -> result = operand2 - operand1;
                    case '*' -> result = operand2 * operand1;
                    case '+' -> result = operand2 + operand1;
                    case '/' -> result = operand2 / operand1;

                }
                stack.push(result);
            }
        }
        return stack.peek();
    }
}
