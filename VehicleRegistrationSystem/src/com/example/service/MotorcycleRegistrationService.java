package com.example.service;

import com.example.model.*;
import java.io.IOException;

public class MotorcycleRegistrationService extends VehicleRegisterService {
    @Override
    public void registerProcess() throws IOException {
        Boolean hasSideCar = null;
        System.out.print("Does the motorcycle has sdie car? (Yes/No): ");
        String answer = br.readLine();
        if (answer.equalsIgnoreCase("yes")) {
            hasSideCar = true;
        } else if (answer.equalsIgnoreCase("no")) {
            hasSideCar = false;
        }

        Vehicle motorcycle = new Motorcycle(super.getVehicle().getBrand(), super.getVehicle().getModel(), hasSideCar);
        super.setVehicle(motorcycle);
        vehicles[Vehicle.getVehicleCount()-1] = motorcycle;

    }
}
