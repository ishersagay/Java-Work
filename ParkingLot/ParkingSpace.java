package com.company.ParkingLot;

import com.company.ParkingLot.Utility.IVehicle;
import com.company.ParkingLot.Vehicles.Car;
import com.company.ParkingLot.Vehicles.Motorcycle;
import com.company.ParkingLot.Vehicles.Van;

import java.util.Scanner;

public class ParkingSpace {
    Scanner szKeyboard = new Scanner(System.in);

    private int RegularSpot;
    private int CompactSpot;
    private int SetRegularSpot;
    private int SetCompactSpot;

    // constructor which sets the number of regular and compact spots.. because eahc parking lot is different

    public void setParkingSize(int size){

        if (size % 2 == 0) {
            //This will only work on even numbers
            RegularSpot = size * 3 / 4;
            CompactSpot = size / 4;
            SetRegularSpot = RegularSpot;
            SetCompactSpot = CompactSpot;
        } else {
            System.out.println("You have to enter in a even number");
        }
    }

    public void selectParkVehicle(){
        System.out.println("What Vehicle would you like to park \n1: Motorcycle\n2: Car\n3: Van");
        int choice = szKeyboard.nextInt();

        IVehicle motorcycle = new Motorcycle();
        IVehicle car = new Car();
        IVehicle Van = new Van();

        switch (choice){
            case 1:
                parkSelectedVehicle(motorcycle);
                break;
            case 2:
                parkSelectedVehicle(car);
                break;
            case 3:
                parkSelectedVehicle(Van);
                break;
            default:
                System.out.println("You've not selected the correct input");
        }
    }

    public void ShowParkingSize(){
        System.out.println("There is "+RegularSpot+" spaces left of Regular parking spaces");
        System.out.println("There is "+CompactSpot+" spaces left of Compact parking spaces");
    }

    public void ShowSetSize(){
        System.out.println("The set size of the parking lot is "+ (SetRegularSpot + SetCompactSpot));
    }

    public void StateOfParkingLot(){
        if ( (RegularSpot + CompactSpot) == 0 ){
            System.out.println("Parking Lot is full");
        } else if( (RegularSpot + CompactSpot) == (SetCompactSpot + SetRegularSpot)) {
            System.out.println("Parking Lot is Empty");
        }else {
            System.out.println("Parking lot still has spaces");
        }
    }
    private void parkSelectedVehicle(IVehicle vehicle){
        //TODO change the return from 1 to 0.5 for motorcycle
        System.out.println("You've selected to park a "+vehicle.name());
        if (vehicle.name() == "Van"){
            RegularSpot -= vehicle.parkingSpace();
            System.out.println(vehicle.name()+" has been parked enjoy your day");
        } else {
            System.out.println("Would you like to park in a Regular Spot or a Compact Spot");
            int choice = szKeyboard.nextInt();

            switch (choice){
                case 1:
                    System.out.println("You've selected a Compact Spot");
                    CompactSpot -= vehicle.parkingSpace();
                    break;
                case 2:
                    System.out.println("You've selected a Regular Spot");
                    RegularSpot -= vehicle.parkingSpace();
                    break;
            }
        }
    }

}