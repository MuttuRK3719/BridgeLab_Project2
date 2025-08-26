package customcollections.arraylist;

import customcollections.linkedlist.InterSection;

import java.util.ArrayList;
import java.util.List;

public class InterSectionOfList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 2, 1);
        List<Integer> list2 = List.of(2, 2);
        System.out.println(intersectionOfElement(list1, list2));
    }

    static List<Integer> intersectionOfElement(List<Integer> list1, List<Integer> list2) {
        List<Integer> intersectionsList = new ArrayList<>();
        for (int ele : list1) {
            if (list2.contains(ele) && !intersectionsList.contains(ele)) intersectionsList.add(ele);
        }
        return intersectionsList;
    }
}
