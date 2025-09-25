package multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;

public class ProducerConsumer {
    private static int bifferSize = 5;
    private Queue<Integer> buffer = new LinkedList<>();

    private final Semaphore empty = new Semaphore(5);
    private final Semaphore full = new Semaphore(0);
    private final Semaphore mutex = new Semaphore(1);

    class Producer extends Thread {
        private int id;

        public Producer(int id) {
            this.id = id;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    empty.acquire();
                    mutex.acquire();
                    buffer.add(i);
                    System.out.println("Producer " + id + " produced " + i);
                    mutex.release();
                    full.release();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    public class Consumer extends Thread {
        private int id;

        public Consumer(int id) {
            this.id = id;
        }

        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    full.acquire();
                    mutex.acquire();
                    int item = buffer.remove();
                    System.out.println("Consumer id is :" + id + " item is : " + item);
                    mutex.release();
                    empty.release();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Producer p1 = pc.new Producer(1);
        Producer p2 = pc.new Producer(2);


        Consumer c1 = pc.new Consumer(1);
        Consumer c2 = pc.new Consumer(2);

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }

}
