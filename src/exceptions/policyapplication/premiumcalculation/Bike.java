package exceptions.policyapplication.premiumcalculation;

public class Bike implements PremiumCalculation {
    private double percent = 8;

    @Override
    public double getPremiumAmount(Policy policy) {
        return (percent / 100) * policy.getCoverageAmount();
    }
}
