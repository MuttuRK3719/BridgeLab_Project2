package customcollections.setinterface;

import java.util.HashSet;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();
        Person person1=new Person("muttu");
        set.add(person1);
        person1.name="pras";
        System.out.println(set.contains(person1));
        set.remove(person1);
        System.out.println(set);
    }
}
