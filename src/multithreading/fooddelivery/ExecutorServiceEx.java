package multithreading.fooddelivery;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 15; i++) {
            int id = i;
            executor.submit(() -> {
                System.out.println("Restarant id is :" + id + " " + "Thread name is :" + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            });

        }
        executor.shutdown();
    }
}
