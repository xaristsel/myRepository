package com.codehub.springcoreexamples.travel;

import com.codehub.springcoreexamples.vehicle.Vehicle;

public class ConstructorInjectedTravel {

    private Vehicle myVehicle;

    //I'm injecting the dependency with through the constructor
    public ConstructorInjectedTravel(Vehicle myVehicle) {
        //any time this instance is created it has a Vehicle provided
        this.myVehicle = myVehicle;
        System.out.println("Using Constructor Injection");
    }

    public void startJourney() {
        myVehicle.start();
    }


}
