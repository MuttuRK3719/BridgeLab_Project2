package exceptions.customexception.unchecked;

public class NegativeNumberException extends Exception {
    @Override
    public String getMessage() {
        return "U r entered negative number";
    }
}
