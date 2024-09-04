package com.example.model;

public class Motorcycle extends Vehicle {
    private Boolean hasSidecar;

    public Motorcycle (String brand, String model, Boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }


    public Boolean getHasSidecar() {
        return this.hasSidecar;
    }

    public void setHasSidecar(Boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("----------Motorcycle----------");
        super.displayInfo();
        if (this.hasSidecar) {
            System.out.println("This motorcycle has sidecar." + "\n");
        }else{
            System.out.println("This motorcycle has no sidecar." + "\n");
        }
    }
}
