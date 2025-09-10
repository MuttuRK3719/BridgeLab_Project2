package java8features.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Intermediate {

    // find all numbers greater than 50
    static List<Integer> filter(List<Integer> arr) {
        return arr.stream().filter(i -> i > 50).toList();
    }
    //    list of strings, return a list of their lengths.
    static List<Integer> lengthOfString(List<String> arr) {
        return arr.stream().map(String::length).collect(Collectors.toList());
    }
    //    list of names, sort them in ascending order.
    static List<String> sortNames(List<String> names) {
        return names.stream().sorted((a, b) -> a.compareTo(b)).toList();
    }
    //    List of integers, return only distinct values.
    static List<Integer> distinct(List<Integer> arr) {
        return arr.stream().distinct().toList();
    }
    //    Limit & Skip
    static List<Integer> limitAndSkip(List<Integer> arr, int limit, int skip) {
        return arr.stream().filter(x -> x % 2 == 0).limit(limit).skip(skip).toList();
    }
    //    printing elements after filtering even numbers
    static List<Integer> peekAndFilter(List<Integer> arr) {
        return arr.stream().filter(x -> x % 2 == 0).peek(System.out::println).toList();
    }

}