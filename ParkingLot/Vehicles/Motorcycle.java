package com.company.ParkingLot.Vehicles;

import com.company.ParkingLot.Utility.IVehicle;
import com.company.ParkingLot.Utility.ParkingType;

public class Motorcycle implements IVehicle {

    @Override
    public int parkingSpace() {
        return 1;
    }

    @Override
    public ParkingType type() {
        return new ParkingType("Compact Car");
    }

    @Override
    public String name() {
        return "Motorcycle";
    }
}
