package fuctionalinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class PrintUpperCase {
    public static void main(String[] args) {
        List<String> list = List.of("muttu", "kagal");
        Consumer<String> upperCase = word -> word.toUpperCase();
        list = list.stream().map(word -> word.toUpperCase()).toList();
        System.out.println(list);
    }
}
