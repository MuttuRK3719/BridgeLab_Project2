package collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class InsertionOrder {
    public static void main(String[] args) {
        List<String>list=List.of("apple", "banana", "apple", "orange");
        Set<String>setValues=linkedSetInsertion(list);
        setValues.forEach(element-> System.out.print(element+" "));

    }
    static Set<String> linkedSetInsertion(List<String> list) {
        Set<String> linkedHashset = new LinkedHashSet<>();
        for (String element : list) {
            linkedHashset.add(element);
        }
        return linkedHashset;
    }

}
