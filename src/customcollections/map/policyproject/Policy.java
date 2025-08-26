package customcollections.map.policyproject;

import java.time.LocalDate;

public class Policy {
    private long policyId;
    private String type;
    private double premium;
    private double coverageAmount;
    private LocalDate date;
    private String holderName;



    public Policy(long policyId,String holderName, String type, double premium, double coverageAmount, LocalDate date) {
        this.policyId = policyId;
        this.holderName=holderName;
        this.type = type;
        this.premium = premium;
        this.coverageAmount = coverageAmount;
        this.date = date;
    }
    public String getHolderName() {
        return holderName;
    }

    public long getPolicyId() {
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
    public boolean equals(Object obj){
        return date.hashCode()>((Policy)(obj)).date.hashCode();
    }
    public int hashCode(){
        return date.hashCode();
    }
}
