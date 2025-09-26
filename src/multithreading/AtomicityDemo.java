package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicityDemo {
    private static AtomicInteger delivary = new AtomicInteger(0);

    public static void main(String[] args) {

        Runnable delivaryTask = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                int value = delivary.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + " delivary num is" + value);
            }
        };
        Thread thread1 = new Thread(delivaryTask, "Agent 1");
        Thread thread2 = new Thread(delivaryTask, "Agent 2");
        thread1.start();
        thread2.start();
    }
}
