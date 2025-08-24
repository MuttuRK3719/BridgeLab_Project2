package dsa.stack;

 class Stack<T> {
    private int size = 10;
    T[] stackArray;
    int index = 0;
    private Number min = 99999999;

    Stack() {
        stackArray = (T[]) new Object[size];
    }

    void push(T ch) {
        if (index > stackArray.length) {
            T[] temp = (T[]) new Object[2 * stackArray.length];
            for (int i = 0; i < stackArray.length; i++) {
                temp[i] = stackArray[i];
                size = stackArray.length;
            }
            stackArray = temp;
        }
        if (ch instanceof Number) {
            setMin((Number) ch);
        }
        stackArray[index++] = ch;
    }

    T pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();

        } else {
            return stackArray[--index];
        }
    }

    boolean isEmpty() {
        return index == 0;
    }

    T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return stackArray[index - 1];
    }

    int size() {
        return index;
    }

    private void setMin(Number num) {
        if (num.doubleValue() < min.doubleValue()) min = num;
    }
    public Number getMin(){
        return min;
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(-10);
        stack.push(70);
        stack.push(100);
        System.out.println(stack.pop());//100
        System.out.println(stack.pop());//70
        System.out.println(stack.peek());//-10
        System.out.println(stack.isEmpty());//false
        System.out.println(stack.size());//4
        System.out.println(stack.getMin());//-10
    }

}
