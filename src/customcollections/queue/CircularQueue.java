package customcollections.queue;

import dsa.linkedlist.LinkedList;

public class CircularQueue<T> {
    public static void main(String[] args) {
        CircularQueue<Integer> circularQueue = new CircularQueue<>(5);
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
        this.size = size;
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
