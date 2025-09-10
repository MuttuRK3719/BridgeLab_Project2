package java8features.stream;

import java.util.List;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(new Employee("muttu", 1000000)
                , new Employee("AA", 5000)
                , new Employee("kk", 10000));
        System.out.println(maxSalary(employeeList));

    }

    static double maxSalary(List<Employee> employeeList) {
        return employeeList.stream().map(e -> e.getSalary()).max((a, b) -> a.compareTo(b)).get();
    }

    static double minSalary(List<Employee> employeeList) {
        return employeeList.stream().map(Employee::getSalary).min((a, b) -> a.compareTo(b)).get();
    }

}
