package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletableFuture<String> userThread = CompletableFuture.supplyAsync(() -> {
            sleep(1200);
            return "User name : Muttu";
        });
        CompletableFuture<String> menuFuture = CompletableFuture.supplyAsync(() -> {
            sleep(1500);
            return "Menu: Pizza, Burger, Pasta";
        });
        CompletableFuture<String> priceCalculation = CompletableFuture.supplyAsync(() -> {
            sleep(2000);
            return "100 per Pizza";
        });
        CompletableFuture<Void> allFuture = CompletableFuture.allOf(userThread, menuFuture, priceCalculation);
        CompletableFuture<String> finalResult=allFuture.thenApply(v->{
            String user=userThread.join();
            String menu=menuFuture.join();
            String price=priceCalculation.join();
            return user+"\n"+menu+"\n"+price;
        });
        System.out.println(finalResult.get());
    }
    public static void sleep(int n){
        try{
            Thread.sleep(n);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
