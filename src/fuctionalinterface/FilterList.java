package fuctionalinterface;

import java.util.List;

public class FilterList {
    public static void main(String[] args) {
        List<String> names = List.of("Amit", "Muttu", "Arun");
        names = names.stream().filter(name -> name.startsWith("A")).toList();
        System.out.println("Name start with letter A are : " + names);
    }
}
