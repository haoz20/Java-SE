package com.example.service;

import com.example.model.ContractEmployee;
import com.example.model.Employee;
import com.example.model.FullTimeEmployee;
import com.example.model.PartTimeEmployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeRegistrationService {
    public Employee[] employeeDB = new Employee[100];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private double basicSalary;
    private String type;

    public void getEmployeeInfo() throws IOException {
        String flag;
        do {
            getCommonEmployeeInfo();
            if (type.equalsIgnoreCase("contract")) {
                employeeDB[Employee.getCount() - 1] = this.getContractEmployeeInfo();

            } else if (type.equalsIgnoreCase("fulltime")) {
                employeeDB[Employee.getCount() - 1] = this.getFullTimeEmployeeInfo();

            } else if (type.equalsIgnoreCase("parttime")) {
                employeeDB[Employee.getCount() - 1] = this.getPartTimeEmployeeInfo();
            }
            System.out.print("Do you want to add new Employee(yes/no)? ");
            flag = br.readLine();
        }while (flag.equalsIgnoreCase("yes"));
    }

    public void getCommonEmployeeInfo() throws IOException {
        System.out.print("Enter Employee Name: ");
        this.name = br.readLine();

        System.out.print("Enter Employee Basic Salary: ");
        this.basicSalary = Double.parseDouble(br.readLine());

        System.out.print("Enter Employee Type (contract/fulltime/parttime): ");
        this.type = br.readLine();
    }

    public ContractEmployee getContractEmployeeInfo() throws IOException {
        System.out.print("Enter Contract Duration: ");
        int duration = Integer.parseInt(br.readLine());
        System.out.print("Enter Contract Amount: ");
        Double amount = Double.parseDouble(br.readLine());

        ContractEmployee contractEmp = new ContractEmployee(name, basicSalary, duration, amount);
        return contractEmp;
    }

    public FullTimeEmployee getFullTimeEmployeeInfo() throws IOException {
        System.out.print("Enter Allowance: ");
        Double allowance = Double.parseDouble(br.readLine());
        System.out.print("Enter Bonus: ");
        Double bonus = Double.parseDouble(br.readLine());

        FullTimeEmployee fulltimeEmp = new FullTimeEmployee(name, basicSalary, allowance, bonus);
        return fulltimeEmp;
    }

    public PartTimeEmployee getPartTimeEmployeeInfo() throws IOException {
        System.out.print("Enter Hours Worked: ");
        int hoursWorked = Integer.parseInt(br.readLine());
        System.out.print("Enter Hourly Rate: ");
        Double hourlyRate = Double.parseDouble(br.readLine());

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(name, basicSalary, hoursWorked, hourlyRate);
        return partTimeEmp;
    }





}
