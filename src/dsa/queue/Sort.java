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
        insertSorted(queue, temp, queue.size());
    }

    static void insertSorted(QueueUsingStack<Integer> queue, int value, int size) {
        if (queue.isEmpty() || size == 0) {
            queue.offer(value);
            return;
        }

        int temp = queue.poll();

        if (temp <= value) {
            queue.offer(temp);
            insertSorted(queue, value, size - 1);
        } else {
            queue.offer(value);
            insertSorted(queue, temp, size - 1);
        }
    }
}

