package exceptions.policyapplication.premiumcalculation;

public class DataNotFoundException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Please enter appropriate details";
    }
}
