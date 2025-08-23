package customcollections.setinterface.union;

import java.util.Objects;

public class Person implements Comparable<Person> {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public Integer getAge() { return age; }

        @Override
        public int compareTo(Person other) {
            return this.name.compareTo(other.name); // TreeSet sorts by name
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person(" + name + ", " + age + ")";
        }
    }


