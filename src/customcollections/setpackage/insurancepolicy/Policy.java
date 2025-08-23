package customcollections.setpackage.insurancepolicy;

import java.time.LocalDate;

public class Policy {
    private static Long count = 10000L;
    private Long policyNumber;
    private String holderName;
    private LocalDate expireDate;
    private String coverageType;
    private double amount;

    @Override
    public String toString() {
        return "Policy{" +
                " policyNumber=" + policyNumber +
                ", holderName='" + holderName + '\'' +
                ", expireDate=" + expireDate +
                ", coverageType='" + coverageType + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return policyNumber.hashCode() == ((Policy) (obj)).policyNumber.hashCode();
    }

    public Policy() {
        policyNumber = ++count;
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    public long getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(long policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDateInDay(int days) {
        this.expireDate = LocalDate.now().plusDays(days);
    }

    public void setExpireDateInYear(int year) {
        this.expireDate = LocalDate.now().plusYears(year);
    }

    public void setExpireDateInMonth(int months) {
        this.expireDate = LocalDate.now().plusMonths(months);
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
