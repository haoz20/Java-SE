package com.example.service;

import com.example.model.PartTimeEmployee;

import java.io.IOException;

public class PartTimeEmployeeRegistrationService extends EmployeeRegistrationService {

    @Override
    public PartTimeEmployee employeeInfo() throws IOException {
        System.out.print("Enter Hours Worked: ");
        int hoursWorked = Integer.parseInt(br.readLine());
        System.out.print("Enter Hourly Rate: ");
        Double hourlyRate = Double.parseDouble(br.readLine());

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(this.getName(), this.getBasicSalary(), hoursWorked, hourlyRate);
        return partTimeEmp;
    }
}
