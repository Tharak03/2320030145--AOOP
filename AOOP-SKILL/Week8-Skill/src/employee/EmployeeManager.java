package employee;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> filterEmployeesBySalary(double minSalary) {
        return employees.stream()
                        .filter(e -> e.getSalary() >= minSalary)
                        .collect(Collectors.toList());
    }

    public List<Employee> sortEmployeesBySalary() {
        return employees.stream()
                        .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                        .collect(Collectors.toList());
    }

    public Optional<Employee> findHighestSalaryEmployee() {
        return employees.stream()
                        .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
    }

    public OptionalDouble calculateAverageSalary() {
        return employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .average();
    }
}
