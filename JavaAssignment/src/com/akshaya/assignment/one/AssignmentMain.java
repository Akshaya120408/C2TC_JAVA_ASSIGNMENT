package com.akshaya.assignment.one;
import java.util.Scanner;

import com.akshaya.assignment.one.employees.*;
import com.akshaya.assignment.one.utilities.*;

public class AssignmentMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Manager
        System.out.println("Enter Manager Details:");
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("Employee ID: ");
        int mId = sc.nextInt();
        System.out.print("Salary: ");
        double mSalary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Department: ");
        String dept = sc.nextLine();

        Manager mgr = new Manager(mName, mId, mSalary, dept);

        // Input for Developer
        System.out.println("\nEnter Developer Details:");
        System.out.print("Name: ");
        String dName = sc.nextLine();
        System.out.print("Employee ID: ");
        int dId = sc.nextInt();
        System.out.print("Salary: ");
        double dSalary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Programming Language: ");
        String lang = sc.nextLine();

        Developer dev = new Developer(dName, dId, dSalary, lang);

        // Display details before salary increase
        System.out.println("\nBefore Salary Increase:");
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        // Ask user for salary hike %
        System.out.print("\nEnter percentage increase for Manager: ");
        double mPercent = sc.nextDouble();
        System.out.print("Enter percentage increase for Developer: ");
        double dPercent = sc.nextDouble();

        // Increase salaries
        EmployeeUtilities.increaseSalary(mgr, mPercent);
        EmployeeUtilities.increaseSalary(dev, dPercent);

        // Display after increment
        System.out.println("\nAfter Salary Increase:");
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        sc.close();
    }
}
