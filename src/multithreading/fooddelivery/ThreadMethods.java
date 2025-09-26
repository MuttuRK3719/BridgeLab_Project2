package multithreading.fooddelivery;

public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread orderThread = new Thread(() -> {
            System.out.println("Food is ordered");
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                System.out.println("Order is Order was interputed:");
                return;
            }
            System.out.println("your order is comformed ");
        });
        Thread cookingThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("order is interrupted !!");
                return;
            }
            System.out.println("Cooking is done ");
        });
        Thread delivaryThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Order is interrupted ");
                    System.out.println("Order is canceled");
                    return;
                }
                try {
                    Thread.sleep(1000);
                    System.out.println("Delivering order... step " + i);

                } catch (InterruptedException e) {
                    System.out.println("Order is interrupted ");
                }
                Thread.yield();

            }
            System.out.println("Order delivered successfully ");

        });
        orderThread.start();
        cookingThread.start();
        orderThread.join();
        cookingThread.join();
        delivaryThread.start();
//        delivaryThread.join();
        Thread.sleep(2000);
        delivaryThread.interrupt();

    }

    public static void delay() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
