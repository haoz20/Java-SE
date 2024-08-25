package com.example.app;

import com.example.model.*;
import com.example.service.EmployeeRegistrationService;

import java.io.IOException;

public class Testing {
    public static void main(String[] args) throws IOException {
        EmployeeRegistrationService service = new EmployeeRegistrationService();
        service.getEmployeeInfo();

        for (int i=0; i < Employee.getCount(); i++) {
            service.employeeDB[i].displayDetails();
        }


    }
}
