package inventorymanagement;

import inventorymanagement.exception.InsufficientStackException;
import inventorymanagement.products.Product;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private int quantity;
    private Product product;
    private double totalAmount;
    private double discont;
    private Map<Product,Integer> productList;
    private double finalAmount;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getDiscont() {
        return discont;
    }

    public void setDiscont(double discont) {
        this.discont = discont;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Bill(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Bill() {
        productList = new HashMap<>();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public void addProduct(Product product,int quantity) throws InsufficientStackException {
        if(product.getStackQuantity()<quantity) throw new InsufficientStackException();
        productList.put(product,productList.getOrDefault(product,0)+1);
    }
}
