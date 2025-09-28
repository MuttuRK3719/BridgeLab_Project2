package multithreading;

public class DemonThreadDemo {
    public static void main(String[] args) {
        Thread demonThread = new Thread(() -> {
            try {
                Thread.sleep(10000);
                System.out.println("Auto saved after 10 secs" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });
        demonThread.setDaemon(true);
        demonThread.start();
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Main task step is: " + i);
        }
    }
}
