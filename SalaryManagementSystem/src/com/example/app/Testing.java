package com.example.app;

import com.example.model.*;
import com.example.service.ContractEmployeeRegistrationService;
import com.example.service.EmployeeRegistrationService;
import com.example.service.FullTimeEmployeeRegistrationService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//    public static void main(String[] args) throws IOException {
//        EmployeeRegistrationService service = new EmployeeRegistrationService();
//        System.out.print("Enter Employee Type: ");
//        String type = br.readLine();
//
//        if (type.equalsIgnoreCase("contract")) {
//            EmployeeRegistrationService contractService = new ContractEmployeeRegistrationService();
//
//        } else if (type.equalsIgnoreCase("fulltime")) {
//            EmployeeRegistrationService fullTimeService = new FullTimeEmployeeRegistrationService();
//
//        } else if (type.equalsIgnoreCase("parttime")) {
//            EmployeeRegistrationService partTimeService = new ContractEmployeeRegistrationService();
//        }
//
//        service.getEmployeeInfo();
//
//        for (int i=0; i < Employee.getCount(); i++) {
//            service.employeeDB[i].displayDetails();
//        }
//
//
//    }

    public static void main(String[] args) {
        Employee parttime = new PartTimeEmployee("Swan", 0, 3, 1000);
        System.out.println(parttime.calculateSalary());
        System.out.println(parttime.getCount());
    }


}
