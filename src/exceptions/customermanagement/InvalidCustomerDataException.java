package exceptions.customermanagement;

public class InvalidCustomerDataException extends Exception {
    @Override
    public String getMessage() {
        return "Customer data is not  matched";
    }
}
