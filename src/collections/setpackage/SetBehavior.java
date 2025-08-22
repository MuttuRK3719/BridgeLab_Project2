package collections.setpackage;

import java.util.*;

public class SetBehavior {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 3, 5, 1, 2);
        Set<Integer> values = hashSetInsertion(list);
        values.forEach(x -> System.out.print(x + " "));//1 2 3 5
        values = linkedSetInsertion(list);
        System.out.println();
        values.forEach(x -> System.out.print(x + " "));//5 3 1 2
        values = treeSetInsertion(list);
        System.out.println();
        values.forEach(x -> System.out.print(x + " "));//1 2 3 5

    }

    static Set<Integer> hashSetInsertion(List<Integer> list) {
        Set<Integer> hashset = new HashSet<>();
        for (int element : list) {
            hashset.add(element);
        }
        return hashset;
    }

    static Set<Integer> linkedSetInsertion(List<Integer> list) {
        Set<Integer> linkedHashset = new LinkedHashSet<>();
        for (int element : list) {
            linkedHashset.add(element);
        }
        return linkedHashset;
    }

    static Set<Integer> treeSetInsertion(List<Integer> list) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int element : list) {
            treeSet.add(element);
        }
        return treeSet;
    }
}
