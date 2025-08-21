package dsa.queue1;


public class QueueUsingStack<T> {
    public static void main(String[] args) {
        QueueUsingStack<Integer> queue = new QueueUsingStack<>();
        queue.offer(-10);
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(90);
        queue.offer(100);


        System.out.println(queue.poll());
//        System.out.println(queue.poll());
        System.out.println(queue.size());
    }

    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    void offer(T input) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(input);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    T poll() {
        if (stack1.isEmpty()) {
            throw new IndexOutOfBoundsException("No elements is available ");
        }
        return stack1.pop();
    }

    T peek() {
        if (stack1.isEmpty()) {
            throw new IndexOutOfBoundsException("No elements is available ");
        }
        return stack1.peek();
    }

    int size() {
        return stack1.size();
    }
    boolean isEmpty(){
        return stack1.isEmpty();
    }


}
