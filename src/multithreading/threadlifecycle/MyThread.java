package multithreading.threadlifecycle;

class MyThread extends Thread  {
    public void run() {
        System.out.println("Thread is running...");

        try {
            Thread.sleep(1000);

            synchronized (this) {
                System.out.println("Thread is waiting...");
                wait(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Thread is finished.");
    }
}