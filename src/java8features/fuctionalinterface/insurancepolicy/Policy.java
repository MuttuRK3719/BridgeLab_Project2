package java8features.fuctionalinterface.insurancepolicy;

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

    @Override
    public boolean equals(Object obj) {
        return name.hashCode() == ((Policy) (obj)).name.hashCode();
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
