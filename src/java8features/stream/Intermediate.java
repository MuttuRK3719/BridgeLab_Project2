package java8features.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Intermediate {

    // find all numbers greater than 50
    static List<Integer> filter(List<Integer> arr) {
        return arr.stream().filter(i -> i > 50).toList();
    }

}