package com.company.ParkingLot.Tests;

import com.company.ParkingLot.ParkingSpace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Tests {
    ParkingSpace parkingSpace = new ParkingSpace();

    @BeforeEach
    void setParkingSpace(){
        parkingSpace.setParkingSize(40);
    }

    @Test
    @DisplayName("Should show how many spaces are left")
    void displaySpacesLeft(){
        parkingSpace.ShowParkingSize();
    }

    @Test
    @DisplayName("Should allow the user to park a vehicle of their choice")
    void parkVehicle(){
        parkingSpace.selectParkVehicle();
    }

    @Test
    @DisplayName("Show the Total sum of all parking lots")
    void displayParkingSize(){
        parkingSpace.ShowSetSize();
    }

    @Test
    @DisplayName("Should display parking Lot is empty")
    void isItFullOrNot(){
        parkingSpace.StateOfParkingLot();
    }

}
