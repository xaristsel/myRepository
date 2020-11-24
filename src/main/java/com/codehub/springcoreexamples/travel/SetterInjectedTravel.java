package com.codehub.springcoreexamples.travel;

import com.codehub.springcoreexamples.vehicle.Vehicle;

public class SetterInjectedTravel {

    //This is the dependency
    private Vehicle myVehicle;

    //I'm injecting the dependency with a setter
    public void setVehicle(Vehicle givenVehicle) {
        //I could introduce some logic here ex. is this the Vehicle I'm expecting?
        myVehicle = givenVehicle;
    }

    public void startJourney() {
        myVehicle.start();
    }


}
