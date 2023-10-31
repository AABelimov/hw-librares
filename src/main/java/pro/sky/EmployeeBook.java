package pro.sky;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBook {
    private final List<Employee> employeeBook;

    public EmployeeBook() {
        employeeBook = new ArrayList<>(List.of(
                new Employee("Ivanov", "Ivan", 1, 100000),
                new Employee("Petrov", "Petr", 1, 70000),
                new Employee("Romanov", "Roman", 3, 50000)
        ));
    }

    public void addEmployee(String firstName, String lastName, int department, double salary) {
        if (StringUtils.isAlpha(firstName) && StringUtils.isAlpha(firstName)) {
            firstName = StringUtils.capitalize(firstName);
            lastName = StringUtils.capitalize(lastName);
        } else throw new RuntimeException("Incorrect symbols");
        Employee employee = new Employee(firstName, lastName, department, salary);

        if (employeeBook.contains(employee)) {
            throw new RuntimeException("Employee already added");
        } else {
            employeeBook.add(employee);
        }
    }

    public void removeEmployee(String firstName, String lastName) {
        if (!employeeBook.remove(new Employee(firstName, lastName))) {
            throw new RuntimeException("Employee not found");
        }
    }

    public void printEmployeeBook() {
        System.out.println(employeeBook);
    }
}
