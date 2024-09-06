package com.example.dao;

import com.example.model.*;

public class VehicleDao {
    private static Vehicle[] vehicleDB = new Vehicle[1000];

    public void create(Vehicle vehicle) {
        vehicleDB[Vehicle.getVehicleCount()-1] = vehicle;
    }

    public Vehicle[] getAll() {
        return vehicleDB;
    }

}
