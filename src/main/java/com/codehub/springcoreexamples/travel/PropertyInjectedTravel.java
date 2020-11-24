package com.codehub.springcoreexamples.travel;

import com.codehub.springcoreexamples.vehicle.Vehicle;

public class PropertyInjectedTravel {

    //This is the dependency
    //Here I need this property to be PUBLIC so the dependency can be injected
    public Vehicle myVehicle;

    public void startJourney() {
        myVehicle.start();
    }

}
