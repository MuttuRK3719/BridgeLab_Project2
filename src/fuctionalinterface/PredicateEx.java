package fuctionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        List<String> listName = List.of("abcde", "mnopabc", "abcdeef");
        listName = listName.stream()
                .filter(name -> name.length() > 5)
                .filter(name -> name.lastIndexOf("abc") != -1).toList();
        System.out.println(listName);
    }
}
