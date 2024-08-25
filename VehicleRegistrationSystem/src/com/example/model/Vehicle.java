package com.example.model;

public class Vehicle {
    private String brand;
    private String model;
    private static int vehicleCount = 0;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        vehicleCount++;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

}
