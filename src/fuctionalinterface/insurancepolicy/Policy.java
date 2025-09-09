package fuctionalinterface.insurancepolicy;

public class Policy {
    private String policyNumber;
    private String name;
    private double amount;

    public Policy(String policyNumber, String name, double amount) {
        this.policyNumber = policyNumber;
        this.name = name;
        this.amount = amount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
