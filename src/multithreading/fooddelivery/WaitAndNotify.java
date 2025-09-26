package multithreading.fooddelivery;

import java.util.LinkedList;
import java.util.Queue;

public class WaitAndNotify {
    private int orderSize = 3;
    Queue<String> queue = new LinkedList<>();

    public synchronized void produce(String order) throws InterruptedException {
        if (queue.size() == orderSize) {
            System.out.println("Order is full ");
            wait();
        }
        queue.offer(order);
        notify();
        System.out.println("Produced: " + order);
    }

    public synchronized String placeOrder() throws InterruptedException {
        if (queue.isEmpty()) {
            System.out.println("Waiting for delivary");
            wait();
        }
        String order = queue.poll();
        System.out.println("Consumed: " + order);
        notify();
        return order;
    }

    public static void main(String[] args) {
        WaitAndNotify object = new WaitAndNotify();
        Thread cookingThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    object.produce("Order-" + i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        Thread customer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    object.placeOrder();
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        cookingThread.start();
        customer.start();
    }

}
