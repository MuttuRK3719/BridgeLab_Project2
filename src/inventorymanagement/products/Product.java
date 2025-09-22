package inventorymanagement;

public abstract class Product {
    private Integer id;
    private String name;
    private double price;
    private int stackQuantity;
    private Product category;
    private double discont;

    public Product(Product category, int stackQuantity, double price, String name, Integer id) {
        this.category = category;
        this.stackQuantity = stackQuantity;
        this.price = price;
        this.name = name;
        this.id = id;
    }
    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStackQuantity() {
        return stackQuantity;
    }

    public void setStackQuantity(int stackQuantity) {
        this.stackQuantity = stackQuantity;
    }

    public Product getCategory() {
        return category;
    }

    public void setCategory(Product category) {
        this.category = category;
    }

    public void reduceStack(int quantity) {
        stackQuantity -= quantity;
    }

    public boolean equals(Object obj) {
        return id.hashCode() == ((Product) (obj)).getId();
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    abstract double getDiscont();
}
