package exceptions.customermanagement;

import java.util.Scanner;

public class CustomerManagementApplication {
    public static void main(String[] args) throws CustomerNotFoundException {
        CustomerCRUDOperation customerManagement = new CustomerManagement();
        customerManagement.addCustomer(new Customer(1234, "muttu", 23, 12345678));
        customerManagement.addCustomer(new Customer(2345, "prasa", 23, 7890));
        customerManagement.updateCustomer(update());
    }

    public static Customer update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer id");
        int id = scanner.nextInt();
        System.out.println("Enter customer name");
        String name = scanner.next();
        System.out.println("Enter customer adhar num");
        long aadhaarNum = scanner.nextInt();
        System.out.println("Enter customer age");
        int age = scanner.nextInt();
        Customer customer = new Customer(id, name, age, aadhaarNum);
        return customer;
    }
}
