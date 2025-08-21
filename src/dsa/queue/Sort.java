package dsa.queue;

public class Sort {
    public static void main(String[] args) {
        QueueUsingStack<Integer> queue = new QueueUsingStack<>();
        queue.offer(5);
        queue.offer(2);
        queue.offer(10);
        queue.offer(15);
        queue.offer(-1);
        queue.offer(-5);
        sort(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

    static void sort(QueueUsingStack<Integer> queue) {
        if (queue.isEmpty()) return;
        int temp = queue.poll();
        sort(queue);
        insertSorted(queue, temp);
    }

    static void insertSorted(QueueUsingStack<Integer> queue, int value) {
        if (queue.isEmpty() || queue.peek() > value) {
            queue.offer(value);
        } else {
            int temp = queue.poll();
            insertSorted(queue, value);
            queue.offer(temp);
        }
    }

}

