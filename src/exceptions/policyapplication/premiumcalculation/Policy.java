package exceptions.policyapplication.premiumcalculation;

import java.time.LocalDate;

public class Policy {
    private String policyId;
    private PremiumCalculation type;
    private double premium;
    private double coverageAmount;
    private LocalDate date;
    private int age;

    public int getAge() {
        return age;
    }

    public Policy(String policyId, PremiumCalculation type, int age,double premium, double coverageAmount, LocalDate date) {
        this.policyId = policyId;
        this.type = type;
        this.age=age;
        this.premium = premium;
        this.coverageAmount = coverageAmount;
        this.date = date;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public String getPolicyId() {
        return policyId;
    }

    public PremiumCalculation getType() {
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
