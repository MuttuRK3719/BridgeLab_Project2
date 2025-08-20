package dsa.stack;

public class Stack<T> {
    private int size = 10;
    T[] stackArray;
    int index = 0;

    Stack() {
        stackArray = (T[]) new Object[size];
    }

    void push(T ch) {
//        if (index > stackArray.length) {
//            char[] temp = new char[2 * stackArray.length];
//            for (int i = 0; i < stackArray.length; i++) {
//                temp[i] = stackArray[i];
//                size=stackArray.length;
//            }
//            stackArray = temp;
//        }
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
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        return stackArray[index-1];
    }

    int size() {
        return index;
    }

}
