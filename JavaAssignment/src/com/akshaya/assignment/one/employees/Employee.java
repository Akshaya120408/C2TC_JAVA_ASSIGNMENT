package com.akshaya.assignment.one.employees;

public class Employee {
	 private String name;
	    private int employeeId;
	    private double salary;

	    
	    public Employee() {}

	    
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    protected void setEmployeeId(int employeeId) {
	        // Protected setter so only subclasses/utilities in package can modify
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        }
	    }

	    @Override
	    public String toString() {
	        return "Employee [Name=" + name + ", ID=" + employeeId + ", Salary=" + salary + "]";
	    }
	
}
