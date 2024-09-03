package com.example.service;

import com.example.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeRegistrationService {
    public Employee[] employeeDB = new Employee[100];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private double basicSalary;
    private String type;

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public String getType() {
        return type;
    }

    public Employee[] getEmployeeDB() {
        return employeeDB;
    }


    public void getEmployeeInfo() throws IOException {
        String flag;
        do {
            this.getCommonEmployeeInfo();
            Employee employee = this.employeeInfo();
            employeeDB[Employee.getCount()] = employee;


            System.out.print("Do you want to add new Employee(yes/no)? ");
            flag = br.readLine();
        }while (flag.equalsIgnoreCase("yes"));
    }

    public Employee employeeInfo() throws IOException {
        return null;
    }


    public void getCommonEmployeeInfo() throws IOException {
        System.out.print("Enter Employee Name: ");
        this.name = br.readLine();

        System.out.print("Enter Employee Basic Salary: ");
        this.basicSalary = Double.parseDouble(br.readLine());

        System.out.print("Enter Employee Type (contract/fulltime/parttime): ");
        this.type = br.readLine();
    }




}
