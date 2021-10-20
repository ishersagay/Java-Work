package com.company.ParkingLot.Vehicles;

import com.company.ParkingLot.Utility.IVehicle;
import com.company.ParkingLot.Utility.ParkingType;

public class Car implements IVehicle {

    @Override
    public int parkingSpace() {
        return 1;
    }

    @Override
    public ParkingType type() {
        return new ParkingType("Both");
    }

    @Override
    public String name() {
        return "Car";
    }
}
