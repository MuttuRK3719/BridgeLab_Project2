package java8features.fuctionalinterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxInteger {
    public static void main(String[] args) {
        List<Integer> nums = List.of(100, 2, 4, 45, 90);
//        System.out.println(num);
        String word = "muttu muttjfsjdsjsau r k r r k";
        System.out.println(mostFrequentWords(word));
        System.out.println(maxValue(nums));

    }

    public static int maxValue(List<Integer> nums) {
        return nums.stream().max((a, b) -> a.compareTo(b)).orElse(-1);

    }

    public static int mostFrequentWords(String sentence) {
        return Arrays
                .stream(sentence.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting())).values().stream().mapToInt(Long::intValue).max().orElse(-1);

    }
}
