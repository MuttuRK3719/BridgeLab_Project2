package exceptions.customexception.unchecked;

public class Account {
    private String name;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


}
