package customcollections.map;

public class Person implements Comparable {
    private long mobileNumber;
    private String name;

    public String getName() {
        return name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public Person(long mobileNumber, String name) {
        this.mobileNumber = mobileNumber;
        this.name = name;
    }

    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Person) (o)).name);

    }

    @Override
    public String toString() {
        return "Person{" +
                "mobileNumber=" + mobileNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
