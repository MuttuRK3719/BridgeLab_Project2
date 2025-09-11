package java8features.optionalclass.employeeperformance;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeOperation {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1001, "Amit Sharma", 500.0, "Finance");
        Employee employee2 = new Employee(1002, "Priya Menon", 6000.0, "Human Resources");
        Employee employee3 = new Employee(1003, "Rakesh Patil", 5000.0, "IT");
        Employee employee4 = new Employee(1004, "Sneha Reddy", 6500.0, "IT");
        Employee employee5 = new Employee(1005, "Vikram Desai", 3000.0, "IT");
        List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5);
        getIT(employees, "IT", 5000).forEach(System.out::println);
        System.out.println(
                getDeptEmp(employees, "I")
                        .map(list -> list.stream()
                                .map(Employee::toString)
                                .collect(Collectors.joining("\n")))
                        .orElse("No employee")
        );
    }

    public static List<Employee> getIT(List<Employee> employeeList, String department, double salary) {
        return employeeList
                .stream()
                .filter(
                        e -> e.getDepartment()
                                .equalsIgnoreCase(department)
                                && e.getSalary() > salary)
                .toList();
    }

    public static long countDepartment(List<Employee> employeeList) {
        return employeeList
                .stream()
                .filter(e -> e.getDepartment()
                        .equalsIgnoreCase("HR"))
                .count();
    }

    public static Employee highestSalaryEmployee(List<Employee> employeeList) {
        return employeeList
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
    }

    public static Optional<List<Employee>> getDeptEmp(List<Employee> employeeList, String dept) {
        List<Employee> filteredList = employeeList.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(dept))
                .toList();

        return filteredList.isEmpty() ? Optional.empty() : Optional.of(filteredList);
    }

}