package customcollections.setpackage;

import java.util.*;

public class SubSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        List<Integer> list = List.of(1, 2, 3);
        set1.addAll(list);
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list1 = List.of(1, 2, 3, 4);
        set2.addAll(list1);
        System.out.println(isSubSetHashSet(set1, set2));//true
        set1 = new LinkedHashSet<>(list);
        set2 = new LinkedHashSet<>(list1);
        System.out.println(isSubSetHashSet(set1, set2));//true
        set1 = new TreeSet<>(list);
        set2 = new TreeSet<>(list1);
        System.out.println(isSubSetHashSet(set1, set2));//true

    }

    static boolean isSubSetHashSet(Set<Integer> set1, Set<Integer> set2) {
        for (Integer ele : set1) {
            if (!set2.contains(ele)) {
                return false;
            }
        }
        return true;
    }
}
