package com.example.service;

import java.io.IOException;

public class MotorcycleRegistrationService extends VehicleRegisterService {
    @Override
    public void registerProcess() throws IOException {
        Boolean hasSideCar;
        System.out.print("Does the motorcycle has sdie car? (Yes/No): ");
        String answer = br.readLine();
        if (answer.equalsIgnoreCase("yes")) {
            hasSideCar = true;
        } else if (answer.equalsIgnoreCase("no")) {
            hasSideCar = false;
        }



    }
}
