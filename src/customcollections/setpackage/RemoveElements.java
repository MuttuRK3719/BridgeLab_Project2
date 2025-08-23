package customcollections.setpackage;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class RemoveElements {
    public static void main(String[] args) {
TreeSet<Integer>set=new TreeSet<>();
set.addAll(List.of(1,2,3,4,5));
        System.out.println(removeElements(set,3));
    }
    static TreeSet<Integer> removeElements(TreeSet<Integer> set,int val){
        Iterator<Integer>iterator=set.iterator();
        while (iterator.hasNext()){
            if(iterator.next()<val){
                iterator.remove();
            }
        }
        return set;
    }
}
