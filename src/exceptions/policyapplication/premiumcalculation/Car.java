package exceptions.policyapplication.premiumcalculation;

public class Car implements PremiumCalculation {
    private double percent=15;

    @Override
    public double getPremiumAmount(Policy policy) {
        return (percent / 100) * policy.getCoverageAmount();
    }
}




