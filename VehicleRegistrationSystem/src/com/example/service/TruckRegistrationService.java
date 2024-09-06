package com.example.service;

import com.example.model.*;
import java.io.IOException;

public class TruckRegistrationService extends VehicleRegisterService {

    @Override
    public Vehicle registerProcess() throws IOException {
        System.out.print("Enter payload Capacity: ");
        double payloadCapacity = Double.parseDouble(br.readLine());

        Vehicle truck = new Truck(super.getVehicle(), payloadCapacity);
        return truck;
    }
}
