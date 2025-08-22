package collections.customobject;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
                persons.add(new Person("Muttu", 22));
                persons.add(new Person("Prasanna", 23));
                persons.add(new Person("Muttu", 22));
        persons.forEach(person -> System.out.println(person + " "));
    }
}
