package java8features.fuctionalinterface;

import java.util.List;

public class BiFunctionalEx {
    public static void main(String[] args) {
        List<String> stringList = List.of("muttu", "kagal", "R", "K");
        String word = stringList.stream().reduce("", (a, b) -> a.isEmpty() ? b : a + " " + b);
        System.out.println(word);
    }
}
