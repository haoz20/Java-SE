package com.example.model;

public class Truck extends Vehicle{
    private double payloadCapacity;

    public Truck(String brand, String model, double payloadCapacity) {
        super(brand, model);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return this.payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload Capacity: " + this.payloadCapacity + "\n");
    }
}
