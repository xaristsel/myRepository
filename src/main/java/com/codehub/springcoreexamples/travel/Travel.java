package com.codehub.springcoreexamples.travel;

import com.codehub.springcoreexamples.vehicle.Vehicle;

public class Travel {

    /*
        Instead of creating an instance of specific type, we use one of an interface,
        allowing many objects implementing Vehicle interface to be injected
     */
    Vehicle myVehicle;

    public void setMyVehicle(Vehicle myVehicle) {
        this.myVehicle = myVehicle;
    }

    public void startJourney() {
      myVehicle.start();
    }
}
