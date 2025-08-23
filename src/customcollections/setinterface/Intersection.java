package customcollections.setinterface;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        List<Integer> list1=List.of(1, 2, 3);
        List<Integer> list2=List.of(2, 3, 4);
        List<Integer> list3=List.of(3, 4, 5);


        List<List<Integer>>lists=List.of(list1,list2,list3);
        System.out.println(interSection(lists));
    }
    static Set<Integer> interSection(List<List<Integer>>list){
        Set<Integer> intersection=new HashSet<>(list.get(0));
        intersection.retainAll(list.get(1));
        intersection.retainAll(list.get(2));
        return intersection;
    }
}
