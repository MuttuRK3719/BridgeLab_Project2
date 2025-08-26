package exceptions.customermanagement;

public interface CustomerCRUDOperation {
    void addCustomer(Customer customer);

    void updateCustomer(Customer customer) throws CustomerNotFoundException;

    void deleteCustomer(Customer customer) throws CustomerNotFoundException;

    void displayCustomer(Customer customer) throws CustomerNotFoundException;

}
