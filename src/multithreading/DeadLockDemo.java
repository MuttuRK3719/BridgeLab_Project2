package multithreading;

public class DeadLockDemo {
    private static Object lock1=new Object();
    private static Object lock2=new Object();

    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            synchronized (lock1){
                System.out.println("Thread 1 is holding lock1 ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1 is waiting for lock2 ");
                synchronized (lock2){
                    System.out.println("Thread 1 is aquired lock2");
                }
            }
        });
        Thread thread2=new Thread(()->{
            synchronized (lock2){
                System.out.println("Thread 2 is holding lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2 is waiting for lock1");
                synchronized (lock1){
                    System.out.println("Thread 2 is aquired lock1");
                }
            }
        });

    }
}
