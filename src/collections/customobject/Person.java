package collections.customobject;

import java.util.Objects;

public class Person{
    private Integer age;
    private String name;

    Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object name) {
        return this.name.hashCode()==((Person)(name)).hashCode();
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                "age=" + age +
                '}';
    }

}
