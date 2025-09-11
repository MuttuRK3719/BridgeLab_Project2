package java8features.optionalclass.ecommerce;

public class Order {
    private int id;
    private String name;
    private double totalAmount;
    private String status;

    public Order(int id, String name, double totalAmount, String status) {
        this.id = id;
        this.name = name;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }
}
