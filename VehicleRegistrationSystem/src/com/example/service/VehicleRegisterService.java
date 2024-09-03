package com.example.service;

import com.example.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    private Vehicle vehicle;
    public static Vehicle[] vehicles = new Vehicle[100];
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void create() throws IOException {
        commonRegisterProcess();
        registerProcess();
    }

    public void commonRegisterProcess() throws IOException {
        System.out.print("Enter brand: ");
        String brand = br.readLine();

        System.out.print("Enter model: ");
        String model = br.readLine();

        this.vehicle = new Vehicle(brand, model);


    }

    public void registerProcess() throws IOException {

    }

    public void display() {
        for (int i = 0; i < Vehicle.getVehicleCount(); i++) {
            vehicles[i].displayInfo();
        }
        System.out.println(Vehicle.getVehicleCount());
    }

}
