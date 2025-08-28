package exceptions.policyapplication.onlinepayment;

public class InvalidPaymentDetailsException extends RuntimeException {
    public String getMessage() {
        return "Your entered details is seems like wrong ";
    }
}
