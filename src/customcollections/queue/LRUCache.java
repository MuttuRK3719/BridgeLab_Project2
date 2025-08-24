package customcollections.queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LRUCache {
    private int capacity;
    private Queue<Integer> queue;
    private Set<Integer> set;

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.refer(2);
        cache.refer(3);
        cache.refer(4);
        cache.display();//[2, 3, 4]
        cache.refer(2);
        cache.display();//[3, 4, 2]
        cache.refer(5);
        cache.display();//[4, 2, 5]
    }

    LRUCache(int capacity) {
        this.capacity = capacity;
        queue = new LinkedList<>();
        set = new HashSet<>();
    }


    void refer(int key) {
        if (set.contains(key)) {
            queue.remove(key);
            queue.add(key);
        } else {
            if (queue.size() == capacity) {
                int removed = queue.poll();
                set.remove(removed);
            }
            queue.add(key);
            set.add(key);
        }
    }

    void display() {
        System.out.println(queue);
    }

}
