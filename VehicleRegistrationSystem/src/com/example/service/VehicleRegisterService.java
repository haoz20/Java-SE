package com.example.service;

import com.example.model.*;

import java.beans.VetoableChangeListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    private Vehicle vehicle;
    public Vehicle[] vehicles = new Vehicle[100];
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void create() throws IOException {
        commonRegisterProcess();
        registerProcess();
    }

    public void commonRegisterProcess() throws IOException {
        System.out.print("Enter brand: ");
        String brand = br.readLine();

        System.out.print("Enter model: ");
        String model = br.readLine();

        System.out.print("Enter vehicle type (car/truck/motorcycle): ");
        String type = br.readLine();

    }

    public void registerProcess() throws IOException {

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
