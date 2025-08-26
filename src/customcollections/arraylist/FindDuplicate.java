package customcollections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 2, 6, 3, 3);
        findDuplicate(list);
    }

    static void findDuplicate(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();
        for (int element : list) {
            if (!list1.contains(element)) {
                list1.add(element);
            } else if (!duplicate.contains(element)) {
                duplicate.add(element);
            }
        }
        System.out.println(list1);
        System.out.println(duplicate);
    }
}

