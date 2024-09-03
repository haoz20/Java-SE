package com.example.model;


public class Employee {

    private String name;
    private int employeeId;
    private double basicSalary;
    private static int count;

    public Employee(String name, double basicSalary) {
        this.name = name;
        ++count;
        this.employeeId = count;
        this.basicSalary = basicSalary;
    }


    public static int getCount() {
        return count;
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayDetails() {
        System.out.println("Employee: " +this.name);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Total Salary: " + this.calculateSalary() + "\n");
    }

}
