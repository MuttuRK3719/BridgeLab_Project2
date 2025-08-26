package exceptions.customexception.unchecked;

public class InsufficientFundsException extends Exception{
    public String getMessage(){
        return "Insufficient balance ";
    }
}
