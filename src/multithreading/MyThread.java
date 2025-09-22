package multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(3000);
                System.out.println("Hiii");

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
    }
}
