package exceptions.customexception;

public class InvalidAgeException extends Exception {
    @Override
    public String getMessage() {
        return "You are not eligible for voting ";
    }
}
