package inventorymanagement;

import inventorymanagement.products.Product;

import java.util.List;

public class DiscontCalculatation {
    public double getTotalAmount(Product product, int quantity) {
        double amount = product.getPrice() * quantity;
        return amount;
    }

    public double getDiscont(List<Product> productList) {
        double amount = 0;
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            amount += product.getPrice() * (product.getDiscont()/100);
        }
        return amount;
    }

    public double getDiscont(Product product) {
        return product.getPrice() * product.getDiscont()/100;
    }

    public double calculateFinalAmount(double totalAmount, double discont) {
        return totalAmount - discont;
    }
}
