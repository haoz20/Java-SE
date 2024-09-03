package com.example.service;

import com.example.model.*;

import java.io.IOException;

public class CarRegistrationService extends VehicleRegisterService {

    @Override
    public void registerProcess() throws IOException {
        System.out.print("Enter number of doors: ");
        int doors = Integer.parseInt(br.readLine());

        Vehicle car = new Car(super.getVehicle(), doors);
        super.setVehicle(car);
        vehicles[Vehicle.getVehicleCount()-1] = car;

    }
}
