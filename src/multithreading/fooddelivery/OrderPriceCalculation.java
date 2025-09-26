package multithreading.fooddelivery;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class OrderPriceCalculation implements Callable<Double> {
    private double price, discont;

    public OrderPriceCalculation(double price, double discont) {
        this.price = price;
        this.discont = discont;

    }

    @Override
    public Double call() throws Exception {
        Thread.sleep(2000);
        return price - (price * discont / 100);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<Double>> result=new ArrayList<>();
        ExecutorService executor= Executors.newFixedThreadPool(2);
        result.add(executor.submit(new OrderPriceCalculation(1000,5)));
        result.add(executor.submit(new OrderPriceCalculation(2000,3)));
        result.add(executor.submit(new OrderPriceCalculation(3000,8)));
        while (!result.get(2).isDone()){
            System.out.println("Wait");
            Thread.sleep(500);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("The final values is : "+result.get(i).get());

        }

        executor.shutdown();
    }
}
