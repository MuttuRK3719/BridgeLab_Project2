package inventorymanagement;

import inventorymanagement.disconts.DiscontService;
import inventorymanagement.products.Product;

public class Clothing extends Product {
    private static double discont;

    public double getDiscont() {
        return discont;
    }

    public static void setDiscont(DiscontService service) {
        Clothing.discont = service.getDiscont();
    }
}
