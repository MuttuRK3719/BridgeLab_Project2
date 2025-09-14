package dsa.queue1;

“In a queue, elements are removed from the front.
In an array implementation, if we try to actually delete the
front element and shift all remaining elements forward, it takes O(n) time every removal. That’s inefficient.

Instead, we keep a front pointer that just moves forward 
    when we remove an element. This avoids shifting, so removal is O(1).

But the drawback is: once the rear reaches the end of the array,
    even if there’s free space at the beginning, it can’t be reused. That’s why we use a circular queue, 
    where the rear can wrap around to the beginning and reuse the space.”

public class CircularQueue {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        circularQueue.display();
        System.out.println(circularQueue.dequeue());
        circularQueue.enqueue(50);

        circularQueue.display();
    }

    private int[] arr;
    private int front, rear, size;

    CircularQueue(int size) {
        this.size=size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("arrays is full ");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
    }

    int dequeue() {
        if (front == -1) {
            throw new RuntimeException("Empty queue ");
        }
        int result = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty ");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
