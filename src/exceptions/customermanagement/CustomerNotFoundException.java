package exceptions.customermanagement;

public class CustomerNotFoundException extends Exception{
    @Override
    public String getMessage(){
        return "This type customer id is not available";
    }
}
