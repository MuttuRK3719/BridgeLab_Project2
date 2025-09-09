package fuctionalinterface;

import java.util.List;

public class ReduceFunction {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 3, 1);
        long square = numbers.stream().filter(x -> x % 2 == 0)
                .reduce(0, (a, b) -> a + b * b);
        System.out.println(square);
    }
}
