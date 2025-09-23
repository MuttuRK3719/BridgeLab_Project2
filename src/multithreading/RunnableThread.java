package multithreading;

public class RunnableThread implements Runnable {
    private String name;

    public RunnableThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Thread name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableThread("Thread1"));
        Thread thread2 = new Thread(new RunnableThread("Thread2"));
        Thread thread3 = new Thread(new RunnableThread("Thread3"));
        Thread thread4 = new Thread(new RunnableThread("Thread4"));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
