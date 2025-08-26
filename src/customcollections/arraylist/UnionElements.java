package customcollections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = List.of(3, 4, 5, 6);
        System.out.println(unionList(list1, list2));
    }

    static List<Integer> unionList(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        return list1.stream().distinct().toList();
    }
}
