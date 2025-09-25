package multithreading.fooddelivery;

public class Restarent extends Thread {
    private static String food = "Roti";

    public static void main(String[] args) {
        Thread kichenThread = new Thread(() -> {
            synchronized (food) {
                System.out.println("Food is prepering wait ");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Ur food is prepared u can carry");
            }
        });
        Thread delivaryThread = new Thread(() -> {
            synchronized (food) {
                System.out.println("Peeked the food ");
                try {
                    Thread.sleep(5000);

                    System.out.println("Ur food is on the way");
                    Thread.sleep(5000);
                    System.out.println("Thank you for ording");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        kichenThread.start();
        delivaryThread.start();
    }
}
