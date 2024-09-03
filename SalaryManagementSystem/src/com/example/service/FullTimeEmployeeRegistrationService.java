package com.example.service;

import com.example.model.FullTimeEmployee;

import java.io.IOException;

public class FullTimeEmployeeRegistrationService extends EmployeeRegistrationService {

    @Override
    public FullTimeEmployee employeeInfo() throws IOException {
        System.out.print("Enter Allowance: ");
        Double allowance = Double.parseDouble(br.readLine());
        System.out.print("Enter Bonus: ");
        Double bonus = Double.parseDouble(br.readLine());

        FullTimeEmployee fulltimeEmp = new FullTimeEmployee(this.getName(), this.getBasicSalary(), allowance, bonus);
        return fulltimeEmp;
    }
}
