package com.example.service;

import com.example.model.*;
import java.io.IOException;

public class TruckRegistrationService extends VehicleRegisterService {

    @Override
    public void registerProcess() throws IOException {
        System.out.print("Enter payload Capacity: ");
        double payloadCapacity = Double.parseDouble(br.readLine());

        Vehicle truck = new Truck(super.getVehicle().getBrand(), super.getVehicle().getModel(), payloadCapacity);
        vehicles[Vehicle.getVehicleCount()-1] = truck;

    }
}
