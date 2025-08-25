package customcollections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        Comparator<Person> comparator=(person1,person2)->
                                        person1.getName().compareTo(person2.getName());
        Map<Person, Long> phoneBook = new TreeMap<>(comparator);
        Person person1 = new Person(7892, "Muttu");
        Person person2 = new Person(1234, "Prasanna");
        Person person3 = new Person(2345, "Dhanush");
        phoneBook.put(person1, person1.getMobileNumber());
        phoneBook.put(person2, person2.getMobileNumber());
        phoneBook.put(person3, person3.getMobileNumber());
        for(var map:phoneBook.entrySet()){
            System.out.println(map);
        }

    }

}
