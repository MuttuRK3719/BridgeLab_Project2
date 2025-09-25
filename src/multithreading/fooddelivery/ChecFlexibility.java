package multithreading.fooddelivery;

public class ChecFlexibility {
    public static void main(String[] args) {
        Thread restarent = new Thread(() -> {
            System.out.println("Extending the thread class");
        });
        Runnable deliveryAgent = new Runnable() {
            @Override
            public void run() {
                System.out.println("Implementing Runnable interface");
            }
        };
        restarent.start();
        new Thread(deliveryAgent).start();
    }
}
