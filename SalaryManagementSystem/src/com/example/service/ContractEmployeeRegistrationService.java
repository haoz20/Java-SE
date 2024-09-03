package com.example.service;

import com.example.model.ContractEmployee;

import java.io.IOException;

public class ContractEmployeeRegistrationService extends EmployeeRegistrationService {

    @Override
    public ContractEmployee employeeInfo() throws IOException {
        System.out.print("Enter Contract Duration: ");
        int duration = Integer.parseInt(br.readLine());
        System.out.print("Enter Contract Amount: ");
        Double amount = Double.parseDouble(br.readLine());

        ContractEmployee contractEmp = new ContractEmployee(this.getName(), this.getBasicSalary(), duration, amount);
        return contractEmp;
    }
}
