package multithreading;

public class StarvationDemo {
    public static void main(String[] args) {
        Runnable delivaryTask = () -> {
            System.out.println(Thread.currentThread().getName() + " is delivaring ...");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };
        Thread highAgent1 = new Thread(delivaryTask, "High Agent 1");
        Thread highAgent2 = new Thread(delivaryTask, "High Agent 2");
        Thread lowAgent = new Thread(delivaryTask, "Low Agent");
        highAgent1.setPriority(10);
        highAgent1.setPriority(10);
        lowAgent.setPriority(1);
        highAgent1.start();
        highAgent2.start();
        lowAgent.start();
    }
}
