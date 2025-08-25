package customcollections.arraylist;

import java.time.LocalDate;

public class Policy {
    private String policyId;
    private String type;
    private double premium;
    private double coverageAmount;
    private LocalDate date;

    public Policy(String policyId, String type, double premium, double coverageAmount, LocalDate date) {
        this.policyId = policyId;
        this.type = type;
        this.premium = premium;
        this.coverageAmount = coverageAmount;
        this.date = date;
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getType() {
        return type;
    }

    public double getPremium() {
        return premium;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "premiumId='" + policyId + '\'' +
                ", type='" + type + '\'' +
                ", premium=" + premium +
                ", coverageAmount=" + coverageAmount +
                ", date=" + date +
                '}';
    }
}
