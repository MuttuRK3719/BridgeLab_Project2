package multithreading;


public class DeadLockDemo2 {
    private static String helmate = "Helmate";
    private static String bike = "Bike";

    public static void main(String[] args) {
        Thread helmateThread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " Waiting for helmate");
            try {
                synchronized (helmate) {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " Helmate is weared successfully");

                    System.out.println(Thread.currentThread().getName() + " Waiting for Bike");
                    synchronized (bike) {
                        Thread.sleep(2000);

                        System.out.println(Thread.currentThread().getName() + " taken bike successfully");
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });
        Thread bikeThread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " Waiting for Bike");
            try {
                synchronized (bike) {
                    Thread.sleep(5000);

                    System.out.println(Thread.currentThread().getName() + " taken bike successfully");

                    System.out.println(Thread.currentThread().getName() + " Waiting for helmate");
                    synchronized (helmate) {
                        Thread.sleep(5000);

                        System.out.println(Thread.currentThread().getName() + " Helmate is weared successfully");
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });
        bikeThread.start();
        helmateThread.start();
    }
}
