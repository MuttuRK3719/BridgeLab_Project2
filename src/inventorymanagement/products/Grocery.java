package inventorymanagement;

import inventorymanagement.disconts.DiscontService;

public class Grocery extends Product{
    private static double discont;

    public double getDiscont() {
        return discont;
    }

    public static void setDiscont(DiscontService service) {
        Grocery.discont += service.getDiscont();
    }
}
