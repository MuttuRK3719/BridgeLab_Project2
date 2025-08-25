package customcollections.map;

import java.util.*;

public class SortMapValues {
    public static void main(String[] args) {
        sortMapByValues();
    }
    //
    static void sortMapByValues() {
        Map<String, Integer> map = new HashMap<>();
        map.put("muttu", 789);
        map.put("pras", 123);
        map.put("dhan", 987);
        for (Map.Entry<String, Integer> person : map.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> reversedValues = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> reverse : list) {
            reversedValues.put(reverse.getKey(), reverse.getValue());
        }
        System.out.println("After reversing map by its values ");
        for (Map.Entry<String, Integer> entry : reversedValues.entrySet()) {
            System.out.println(entry);
        }
    }
}
