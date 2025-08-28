package exceptions.policyapplication.claimpolicy;

public class InvalidClaimAmountException extends Exception{
    public String getMessage(){
        return "The amount is more than coverage amount ";
    }
}
