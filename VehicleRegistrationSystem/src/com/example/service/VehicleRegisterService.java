package com.example.service;

import com.example.dao.VehicleDao;
import com.example.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    private Vehicle vehicle;
    private VehicleDao vehicles;
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public VehicleRegisterService() {
        this.vehicles = new VehicleDao();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void create() throws IOException {
        commonRegisterProcess();
        this.vehicles.create(registerProcess());
    }

    public void commonRegisterProcess() throws IOException {
        System.out.print("Enter brand: ");
        String brand = br.readLine();

        System.out.print("Enter model: ");
        String model = br.readLine();

        this.vehicle = new Vehicle(brand, model);

    }

    public Vehicle registerProcess() throws IOException {
        return null;
    }

    public void display() {
        for (int i = 0; i < Vehicle.getVehicleCount(); i++) {
            this.vehicles.getAll()[i].displayInfo();
        }
        System.out.println("The total number of vehicles: " + Vehicle.getVehicleCount());
    }

}
