package com.codehub.springcoreexamples;

import com.codehub.springcoreexamples.vehicle.Car;
import com.codehub.springcoreexamples.vehicle.Vehicle;

public class Travel {

    /*
        Instead of creating an instance of specific type, we create one of an interface one,
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
