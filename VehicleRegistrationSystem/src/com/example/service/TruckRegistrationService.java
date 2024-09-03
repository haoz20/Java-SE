package com.example.service;


import java.io.IOException;

public class TruckRegistrationService extends VehicleRegisterService {

    @Override
    public void registerProcess() throws IOException {
        System.out.println("Enter payload Capacity: ");
        double payloadCapacity = Double.parseDouble(br.readLine());


    }
}
