package multithreading;

public class VolatileFlagEg {
    private static  volatile boolean runner = true;

    public static void main(String[] args) throws InterruptedException {
        Runnable executor = () -> {
                System.out.println(Thread.currentThread().getName()+" Preparing food");
            while (runner) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        };
        Runnable executor2 = () -> {
            while (runner) {
                System.out.println(Thread.currentThread().getName()+" Preparing food");
                try {
                    Thread.sleep(2000);
                    runner=false;
                } catch (InterruptedException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        };
        Thread cookingThread = new Thread(executor, "Cooking thread-1");
        Thread cookingThread1 = new Thread(executor, "Cooking thread-2");
        cookingThread1.start();
        cookingThread.start();
        Thread.sleep(300);
        System.out.println("Main thread changing running = false");
        runner=false;
        cookingThread1.join();
        cookingThread.join();
        System.out.println("Delivary successfully reached");

    }
}
