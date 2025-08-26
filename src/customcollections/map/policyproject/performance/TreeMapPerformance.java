package customcollections.map.policyproject.performance;

import java.util.*;

public class TreeMapPerformance implements Performance {
    Map<Integer, Integer> hashMap = new TreeMap<>();
    Random random = new Random();
    int value = random.nextInt();

    @Override
    public void insertionPerformance() {
        int size = 10000;
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int value = random.nextInt();
            hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
        }
        long endTime = System.nanoTime();
        System.out.println("Insertion time for TreeMap " + (endTime - startTime) / 1e6 + "nano sec");

    }


    @Override
    public void searchPerformance() {
        long startTime = System.nanoTime();
        hashMap.containsKey(value);
        long endTime = System.nanoTime();
        System.out.println("search  time required for TreeMap " + (endTime - startTime) / 1e6 + "nano sec");


    }

    @Override
    public void deletePerformance() {
        long startTime = System.nanoTime();
        hashMap.remove(value);
        long endTime = System.nanoTime();
        System.out.println("delete  time required for TreeMap " + (endTime - startTime) / 1e6 + "nano sec");
    }
}
