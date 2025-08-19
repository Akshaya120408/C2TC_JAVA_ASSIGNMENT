package Assignment1.utilities;
import Assignment1.employees.*;

public class EmployeeUtilities {
    public static void printEmployeeDetails(Employee e) {
        System.out.println(e.toString());
    }
    public static void increaseSalary(Employee e, double percentage) {
        double newSalary = e.getSalary() + (e.getSalary() * percentage / 100);
        e.setSalary(newSalary);
    }
}
