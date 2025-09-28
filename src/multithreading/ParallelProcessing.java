package multithreading;

import java.util.Arrays;
import java.util.List;
public class ParallelProcessing {
    public static void main(String[] args) {
        List<Integer> orders= Arrays.asList(200, 150, 300, 100, 500, 400,1000,2000,4000,200, 150, 300);
        int totalSum= orders.stream().mapToInt(Integer::intValue).sum();
        int totalSumParallel=orders
                .parallelStream()
                .peek(o-> System.out.println("Processing order " +o+" Thread name is "+Thread.currentThread().getName()))
                .mapToInt(Integer::intValue)
                .sum();
    }
}
