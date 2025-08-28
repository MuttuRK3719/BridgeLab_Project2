package exceptions.policyapplication.premiumcalculation;

public class Health implements PremiumCalculation {
    private static double percent=10;

    @Override
    public double getPremiumAmount(Policy policy) {
        return (percent / 100) * policy.getCoverageAmount();
    }
}
