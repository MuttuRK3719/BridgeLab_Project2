package collections.setpackage.union;

import java.util.Set;
import java.util.TreeSet;

public class PersonSetOperations {

    // Union of two sets
    static Set<Person> union(Set<Person> set1, Set<Person> set2) {
        Set<Person> result = new TreeSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // Difference (set1 - set2)
    static Set<Person> difference(Set<Person> set1, Set<Person> set2) {
        Set<Person> result = new TreeSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Person> set1 = new TreeSet<>();
        set1.add(new Person("Alice", 30));
        set1.add(new Person("Bob", 25));

        Set<Person> set2 = new TreeSet<>();
        set2.add(new Person("Bob", 25));
        set2.add(new Person("Charlie", 35));

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Difference: " + difference(set1, set2));
    }
}
