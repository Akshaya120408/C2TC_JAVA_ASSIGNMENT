package Assignment1;
import java.util.Scanner;

import Assignment1.employees.*;
import Assignment1.utilities.*;

public class AssignmentMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Manager Details: ");
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("Employee ID: ");
        int mId = sc.nextInt();
        System.out.print("Salary: ");
        double mSalary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Department: ");
        String dept = sc.nextLine();

        Manager m = new Manager(mName, mId, mSalary, dept);

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

        Developer d = new Developer(dName, dId, dSalary, lang);

        // Display details before salary increase
        System.out.println("\nBefore Salary Increase:");
        EmployeeUtilities.printEmployeeDetails(m);
        EmployeeUtilities.printEmployeeDetails(d);

        // Ask user for salary hike %
        System.out.print("\nEnter percentage increase for Manager: ");
        double mPercent = sc.nextDouble();
        System.out.print("Enter percentage increase for Developer: ");
        double dPercent = sc.nextDouble();

        // Increase salaries
        EmployeeUtilities.increaseSalary(m, mPercent);
        EmployeeUtilities.increaseSalary(d, dPercent);

        // Display after increment
        System.out.println("\nAfter Salary Increase:");
        EmployeeUtilities.printEmployeeDetails(m);
        EmployeeUtilities.printEmployeeDetails(d);

        sc.close();
    }
}
