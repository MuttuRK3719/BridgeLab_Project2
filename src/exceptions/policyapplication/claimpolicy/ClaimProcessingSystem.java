package exceptions.policyapplication.claimpolicy;

import java.time.LocalDate;

public class ClaimProcessingSystem {
    public static void main(String[] args) {
        Policy policy = new Policy("p1234", "car", 5000, 250000, LocalDate.of(2025, 9, 27));
        processClaim(250000, policy);
    }

    public static void processClaim(double amount, Policy policy) {
        try {
            if (amount > policy.getCoverageAmount()) throw new InvalidClaimAmountException();
            else if (policy.getDate().compareTo(LocalDate.now()) > 0) throw new FraudulentClaimException();
            else System.out.println("U can collect ur coverage amount");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
