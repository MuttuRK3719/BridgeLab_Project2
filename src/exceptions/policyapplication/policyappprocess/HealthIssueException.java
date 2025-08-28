package exceptions.policyapplication.policyappprocess;

public class HealthIssueException extends Exception {
    @Override
    public String getMessage() {
        return "Sry you are facing health issue please recover it so  we cannot able to provide health insurance ";
    }
}
