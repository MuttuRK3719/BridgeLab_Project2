package dsa.stack;

public class Stack<T> {
    int size = 10;
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
        if (index >= 0) {
            T ch = stackArray[index];
            index--;
            return ch;
        } else {
            throw new IndexOutOfBoundsException();

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
