package exceptions.policyapplication.onlinepayment;

public class Account {
    private String upiId;
    private int upiPin;
    private double balance;

    public Account(String upiId, int upiPin) {
        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    public Account(String upiId, int upiPin, double balance) {
        this.upiId = upiId;
        this.upiPin = upiPin;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUpiId() {
        return upiId;
    }

    public int getUpiPin() {
        return upiPin;
    }
}
