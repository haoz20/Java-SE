package com.example.service;

import com.example.model.*;

import java.beans.VetoableChangeListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    public Vehicle[] vehicles = new Vehicle[100];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void getVehicleInfo() throws IOException {
        String answer;
        do {
            System.out.print("Enter brand: ");
            String brand = br.readLine();

            System.out.print("Enter model: ");
            String model = br.readLine();

            System.out.print("Enter vehicle type (car/truck/motorcycle): ");
            String type = br.readLine();

            vehicles[Vehicle.getVehicleCount()] = checkVehicleType(brand, model, type);

            System.out.print("Do you want to continue adding information? (yes/no) ");
            answer = br.readLine();

        } while (answer.equalsIgnoreCase("yes"));
    }

    public Vehicle checkVehicleType(String brand, String model, String type) throws IOException {
        if (type.equalsIgnoreCase("Car")) {
            Car car = new Car(brand, model, isCar());
            return car;

        }else if (type.equalsIgnoreCase("Truck")) {
            Truck truck = new Truck(brand, model, isTruck());
            return truck;

        }else if (type.equalsIgnoreCase("Motorcycle")) {
            Motorcycle motorcycle = new Motorcycle(brand, model, isMotorcycle());
            return motorcycle;
        }
        return null;

    }

    public int isCar() throws IOException {
        System.out.print("Enter number of doors: ");
        int doors = Integer.parseInt(br.readLine());
        return doors;
    }

    public double isTruck() throws IOException {
        System.out.print("Enter payload capacity: ");
        double payloadCapacity = Double.parseDouble(br.readLine());
        return payloadCapacity;
    }

    public boolean isMotorcycle() throws IOException {
        System.out.print("Does the motorcycle has a side car? (yes/no) ");
        String hasSideCar = br.readLine();

        return hasSideCar.equalsIgnoreCase("yes");
    }




}
