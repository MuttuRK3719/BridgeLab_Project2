package exceptions.customermanagement;

import exceptions.customexception.unchecked.InsufficientFundsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerManagement implements CustomerCRUDOperation {
    private Map<Integer, Customer> customersList = new HashMap();

    @Override
    public void addCustomer(Customer customer) {
        customersList.put(customer.getCustomerId(), customer);
    }

    @Override
    public void updateCustomer(Customer customer) throws CustomerNotFoundException {
        if (customersList.containsKey(customer.getCustomerId())) {
            Customer customer1 = customersList.get(customer.getCustomerId());
            try {
                if (customer1.getAadhaarNumber() != customer.getAadhaarNumber())
                    throw new InvalidCustomerDataException();
                if (!customer1.getName().equals(customer.getName())) throw new InvalidCustomerDataException();
            } catch (InvalidCustomerDataException exception) {
                System.out.println(exception.getMessage());
            }

        } else {
            throw new CustomerNotFoundException();
        }
    }

    @Override
    public void deleteCustomer(Customer customer) throws CustomerNotFoundException {
        if (customersList.containsKey(customer.getCustomerId())) {
            customersList.remove(customer.getCustomerId());
        } else throw new CustomerNotFoundException();
    }

    @Override
    public void displayCustomer(Customer customer) throws CustomerNotFoundException {
        if (customersList.containsKey(customer.getCustomerId())) {
            Customer customer1 = customersList.get(customer.getCustomerId());
            System.out.println(customer1);
        } else throw new CustomerNotFoundException();
    }
}
