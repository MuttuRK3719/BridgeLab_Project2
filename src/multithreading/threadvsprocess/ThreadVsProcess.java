package multithreading.threadvsprocess;

public class ThreadVsProcess {
    public static void main(String[] args) throws InterruptedException {
        long currentTime = System.currentTimeMillis();
        HeavyTasks.preparingManu();
        HeavyTasks.calculatingDisconts();
        System.out.println("Requiered time for preparing : " + (System.currentTimeMillis() - currentTime));

        long startTime = System.currentTimeMillis();

        Thread menuThread = new Thread(() -> {
            try {
                HeavyTasks.preparingManu();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread calculationThread = new Thread(() -> {
            try {
                HeavyTasks.calculatingDisconts();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        menuThread.start();
        calculationThread.start();
        try {
            menuThread.join();
            calculationThread.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Required time for threads "+(System.currentTimeMillis()-startTime));
    }
}
