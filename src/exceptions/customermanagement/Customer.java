package exceptions.customermanagement;

public class Customer {
    private int customerId;
    private String name;
    private int age;
    private long aadhaarNumber;

    public Customer(int customerId, String name, int age, long aadhaarNumber) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.aadhaarNumber = aadhaarNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getAadhaarNumber() {
        return aadhaarNumber;
    }
}
