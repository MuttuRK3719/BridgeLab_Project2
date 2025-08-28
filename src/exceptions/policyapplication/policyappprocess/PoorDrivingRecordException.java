package exceptions.policyapplication.policyappprocess;

public class PoorDrivingRecordException extends Exception {
    @Override
    public String getMessage() {
        return "Sry you driving rate is very low so we cannot able procced your car insurance";
    }
}
