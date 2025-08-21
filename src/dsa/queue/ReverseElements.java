package dsa.queue;

public class ReverseElements {
    public static void main(String[] args) {
        QueueUsingStack<Integer> que = new QueueUsingStack<>();
        que.offer(10);
        que.offer(20);
        que.offer(30);
        que.offer(40);
        que.offer(50);
        reverseQueue(que);
        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }

    }

    static void reverseQueue(QueueUsingStack<Integer> queue) {
        if (queue.isEmpty()) return;
        int element = queue.poll();
        reverseQueue(queue);
        queue.offer(element);
    }
}
