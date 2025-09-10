package java8features.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperators {
    //    Print all elements of a list of strings.
    static void printUsingForEach(List<Integer> arr) {
        arr.forEach(System.out::println);
    }

}
