package inventorymanagement;

import inventorymanagement.disconts.DiscontService;

public class Eletronics extends Product{
    private static double discont;

    public  double getDiscont() {
        return discont;
    }

    public static void setDiscont(DiscontService service) {
        Eletronics.discont += service.getDiscont();
    }
}
