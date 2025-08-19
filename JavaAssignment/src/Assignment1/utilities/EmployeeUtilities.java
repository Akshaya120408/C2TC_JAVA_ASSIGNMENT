package com.akshaya.assignment.one.utilities;
import com.akshaya.assignment.one.employees.*;

public class EmployeeUtilities {
    public static void printEmployeeDetails(Employee e) {
        System.out.println(e.toString());
    }
    public static void increaseSalary(Employee e, double percentage) {
        double newSalary = e.getSalary() + (e.getSalary() * percentage / 100);
        e.setSalary(newSalary);
    }
}
