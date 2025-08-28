package exceptions.policyapplication.premiumcalculation;

import java.time.LocalDate;

public class CalculatePremium {
    public static void main(String[] args) {
        PremiumCalculation type = new Car();
        Policy policy = new Policy("p101", type, 9, 0, 250000, LocalDate.of(2025, 12, 31));
        double premium = type.getPremiumAmount(policy);
        if (premium == 0) throw new CalculationException();
        policy.setPremium(premium);
        CheckDetails validDetails = new CheckDetails();
        validDetails.checkDetails(policy);
    }
}
