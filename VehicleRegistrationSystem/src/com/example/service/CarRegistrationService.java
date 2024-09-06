package com.example.service;

import com.example.model.*;

import java.io.IOException;

public class CarRegistrationService extends VehicleRegisterService {

    @Override
    public Vehicle registerProcess() throws IOException {
        System.out.print("Enter number of doors: ");
        int doors = Integer.parseInt(br.readLine());

        Vehicle car = new Car(super.getVehicle(), doors);
        return car;
    }
}
