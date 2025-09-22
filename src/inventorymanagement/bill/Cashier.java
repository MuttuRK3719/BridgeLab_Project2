package inventorymanagement;

public class Cashier {
    public Cashier(Bill bill) {
        this.bill = bill;
    }

    private Bill bill;

    public double getTotalAmount() {
        return bill.getFinalAmount();
    }
}
