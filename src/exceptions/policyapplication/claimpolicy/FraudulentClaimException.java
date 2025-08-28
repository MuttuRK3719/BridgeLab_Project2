package exceptions.policyapplication.claimpolicy;

public class FraudulentClaimException extends Exception{
    public String getMessage(){
        return "your policy is expired or date mismatch ";
    }
}
