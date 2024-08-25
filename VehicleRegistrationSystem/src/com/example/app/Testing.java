package com.example.app;

import com.example.service.*;
import com.example.model.*;

import java.io.IOException;

public class Testing {


    public static void main(String[] args) throws IOException {
        VehicleRegisterService service = new VehicleRegisterService();

        service.getVehicleInfo();

        for (int i = 0; i < Vehicle.getVehicleCount(); i++){
            service.vehicles[i].displayInfo();
        }

    }



}
