package exceptions.policyapplication.onlinepayment;

public class PaymentFailedException extends Exception {
    public PaymentFailedException(String message){
       super(message);
   }
}
