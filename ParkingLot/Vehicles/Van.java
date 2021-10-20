package com.company.ParkingLot.Vehicles;

import com.company.ParkingLot.Utility.IVehicle;
import com.company.ParkingLot.Utility.ParkingType;

public class Van implements IVehicle {

    @Override
    public int parkingSpace() {
        return 3;
    }

    @Override
    public ParkingType type() {
        return new ParkingType("Regular Car");
    }

    @Override
    public String name() {
        return "Van";
    }
}
