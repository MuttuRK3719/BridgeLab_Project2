package exceptions.policyapplication;

public class InvalidAgeException extends Exception {
    @Override
    public String getMessage() {
        return "Your age is invalid please enter valid age";
    }
}
