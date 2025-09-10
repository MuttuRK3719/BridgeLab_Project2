package java8features.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperators {
    //    Print all elements of a list of strings.
    static void printUsingForEach(List<Integer> arr) {
        arr.forEach(System.out::println);
    }

    //    Convert a list of integers into a set.
    static Set<Integer> listToSet(List<Integer> arr) {
        return arr.stream().collect(Collectors.toSet());
    }

    //    product of all numbers in a list.
    static long reduceToProduct(List<Integer> arr) {
        return arr.stream().reduce(1, (a, b) -> a * b);
    }

//    counting the name starts with A
    static long countString(List<String> names) {
        return names.stream().filter(name -> name.startsWith("A")).count();
    }
}
