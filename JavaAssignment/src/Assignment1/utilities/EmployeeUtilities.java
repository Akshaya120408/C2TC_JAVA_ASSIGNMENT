package com.akshaya.assignment.one.utilities;
import com.akshaya.assignment.one.employees.*;

public class EmployeeUtilities {

    /**
     * Prints the details of an employee.
     * @param emp Employee object
     */
    public static void printEmployeeDetails(Employee emp) {
        System.out.println(emp.toString());
    }

    /**
     * Increases an employee's salary by a given percentage.
     * Demonstrates usage of access modifiers via public setter and getter.
     * @param emp Employee object
     * @param percentage Percentage to increase
     */
    public static void increaseSalary(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary);
    }
}