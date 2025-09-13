import java8features.optionalclass.employeeperformance.Employee;
import java8features.optionalclass.employeeperformance.EmployeeOperation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeManagementTest {
    Employee employee1 = new Employee(1001, "Amit Sharma", 500.0, "Finance");
    Employee employee2 = new Employee(1002, "Priya Menon", 6000.0, "HR");
    Employee employee3 = new Employee(1003, "Rakesh Patil", 6000.0, "IT");
    Employee employee4 = new Employee(1004, "Sneha Reddy", 6500.0, "Finance");
    Employee employee5 = new Employee(1005, "Vikram Desai", 3000.0, "IT");
    List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5);
    EmployeeOperation operation = new EmployeeOperation();

    @Test
    void getEmployee() {
        List<Employee> expectedList = Arrays.asList(employee3);
        List<Employee> actualList = operation.getIT(employees, "IT", 5000);
        assertEquals(expectedList, actualList);
    }
    @Test
    void countEmployee(){
        long expectedResult = 1;
        long actualResult = operation.countDepartmentEmp(employees, "HR");
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void highestPaidEmp(){
        Optional<Employee> expectedEmployee=Optional.of(employee4);
        Optional<Employee> actualEmployee=operation.highestSalaryEmployee(employees);
        assertEquals(expectedEmployee,actualEmployee);
    }

}
