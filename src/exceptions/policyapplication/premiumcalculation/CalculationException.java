package exceptions.policyapplication.premiumcalculation;

public class CalculationException extends RuntimeException{
    @Override
    public String getMessage(){
        return "we cannot able to calculate premium ";
    }
}
