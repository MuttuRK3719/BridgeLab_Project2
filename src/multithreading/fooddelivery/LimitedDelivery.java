package multithreading.fooddelivery;

public class LimitedDelivery {
    public static int availableStacks = 5;

    public synchronized static boolean bookStack(String name) {
        if (availableStacks > 0) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Slote is booked with " + name + " " + "remaining stacks are : " + (--availableStacks));
            return true;
        } else {
            System.out.println("No slot is available ");
            return false;
        }
    }

    public static void main(String[] args) {
        Runnable deliveryAgent = () -> {
            bookStack(Thread.currentThread().getName());
        };
        for (int i = 0; i < 10; i++) {
            new Thread(deliveryAgent, "customer" + i).start();
        }
    }
}
