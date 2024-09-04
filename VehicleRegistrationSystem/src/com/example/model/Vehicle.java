package com.example.model;

public class Vehicle {
    private String brand;
    private String model;
    private static int vehicleCount = -1;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        vehicleCount++;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

}
