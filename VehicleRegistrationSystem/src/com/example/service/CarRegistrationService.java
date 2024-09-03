package com.example.service;

import java.io.IOException;

public class CarRegistrationService extends VehicleRegisterService {

    @Override
    public void registerProcess() throws IOException {
        System.out.print("Enter number of doors: ");
        int doors = Integer.parseInt(br.readLine());


    }
}
