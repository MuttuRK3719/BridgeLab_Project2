package customcollections.setpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstNonDublicate {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 6, 4, 7, 8, 5);
        Set<Integer> values = linkedSetInsertion(list);
        System.out.println(values.iterator().next());
    }

    static Set<Integer> linkedSetInsertion(List<Integer> list) {
        Set<Integer> linkedHashset = new LinkedHashSet<>();
        for (int element : list) {
            if (linkedHashset.contains(element)) {
                linkedHashset.remove(element);
            } else {

                linkedHashset.add(element);
            }
        }
        return linkedHashset;
    }
}
