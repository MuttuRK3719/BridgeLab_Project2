package multithreading.threadlifecycle;

public class LifeCycleDemo {
    public static void main(String[] args) {
        try {
            MyThread t1 = new MyThread();

            System.out.println("State after creation: " + t1.getState());

            t1.start();
            System.out.println("State after start(): " + t1.getState());

            Thread.sleep(100);
            System.out.println("State after small delay: " + t1.getState());

            Thread.sleep(2000);
            System.out.println("State after sleep/wait: " + t1.getState());

            t1.join();
            System.out.println("State after completion: " + t1.getState());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}