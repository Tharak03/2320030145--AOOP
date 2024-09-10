package company;

public class SalaryCalculator {

    public double calculateSalary(Employee employee) {
        String role = employee.getRole();
        if ("Manager".equalsIgnoreCase(role)) {
            return 70000;
        } else if ("Developer".equalsIgnoreCase(role)) {
            return 50000;
        } else if ("Intern".equalsIgnoreCase(role)) {
            return 20000;
        } else if ("Designer".equalsIgnoreCase(role)) {
            return 45000;
        } else if ("Tester".equalsIgnoreCase(role)) {
            return 40000;
        } else if ("Accountant".equalsIgnoreCase(role)) {
            return 55000;
        } else if ("HR".equalsIgnoreCase(role)) {
            return 60000;
        } else if ("Sales".equalsIgnoreCase(role)) {
            return 52000;
        } else {
            return 25000;  // Default salary
        }
    }
}
