package com.example.model;

public class Car extends Vehicle {
    private int doors;

    public Car (String brand, String model, int doors) {
        super(brand, model);
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + this.doors + "\n");
    }
}
