package fuctionalinterface.sortobjects;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> sortByName = (person1, person2) -> person1.getName()
                .compareTo(person2.getName());
        List<Person> personList = List.of(new Person("Muttu", 22, 8000000)
                , new Person("Dhanush", 22, 8000000)
                , new Person("Prasanna", 22, 8000000));

        personList = personList.stream().sorted(sortByName).toList();
        System.out.println(personList);
    }
}
