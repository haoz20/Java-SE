package com.example.model;

import java.sql.SQLOutput;

public class Employee {

    private String name;
    private int employeeId;
    private double basicSalary;

    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
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
