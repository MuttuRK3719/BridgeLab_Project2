package java8features.fuctionalinterface;

import java.util.List;

public class MaxInteger {
    public static void main(String[] args) {
        List<Integer> nums = List.of(100, 2, 4, 45, 90);
        int num = nums.stream().max((x, y) -> x - y).orElse(-1);
        System.out.println(num);
    }
}
