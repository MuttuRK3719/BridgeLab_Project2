package customcollections.setinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PerformanceComparision {
    public static void main(String[] args) {
        performanceOfHashSet();
        performanceOfLinkedHashSet();
        performanceOfTreeSet();

    }
    static void performanceOfHashSet(){
        long initialTime=System.currentTimeMillis();
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        for (int i = 0; i < 100000; i++) {
            set.remove(i);
        }
        System.out.println("Time required HashSet adding and removing "+(System.currentTimeMillis()-initialTime)+" ms");
    }
    static void performanceOfLinkedHashSet(){
        long initialTime=System.currentTimeMillis();
        Set<Integer> set=new LinkedHashSet<>();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        for (int i = 0; i < 100000; i++) {
            set.remove(i);
        }
        System.out.println("Time required LinkedHashSet adding and removing "+(System.currentTimeMillis()-initialTime)+" ms");
    }
    static void performanceOfTreeSet(){
        long initialTime=System.currentTimeMillis();
        Set<Integer> set=new TreeSet<>();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        for (int i = 0; i < 100000; i++) {
            set.remove(i);
        }
        System.out.println("Time required TreeSet adding and removing "+(System.currentTimeMillis()-initialTime)+" ms");
    }
}
