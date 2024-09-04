package com.example.app;

import com.example.service.*;
import com.example.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        VehicleRegisterService service = null;
        String flag;
        do{
            System.out.print("Enter Vehicle Type (car/motorcycle/truck): ");
            String vehicleType = br.readLine();

            if (vehicleType.equalsIgnoreCase("car")) {
                service = new CarRegistrationService();
            } else if (vehicleType.equalsIgnoreCase("motorcycle")) {
                service = new MotorcycleRegistrationService();
            } else if (vehicleType.equalsIgnoreCase("truck")) {
                service = new TruckRegistrationService();
            }

            service.create();

            System.out.print("Do you want to add another vehicle (yes/no): ");
            flag = br.readLine();
        } while (flag.equalsIgnoreCase("yes"));

        service.display();

    }

}
