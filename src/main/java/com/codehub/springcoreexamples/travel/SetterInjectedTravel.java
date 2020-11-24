package com.codehub.springcoreexamples.travel;

import com.codehub.springcoreexamples.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectedTravel {

    //This is the dependency
    private Vehicle myVehicle;

    //I'm injecting the dependency with a setter
    @Autowired
    public void setVehicle(Vehicle givenVehicle) {
        //I could introduce some logic here ex. is this the Vehicle I'm expecting?
        myVehicle = givenVehicle;
        System.out.println("Using Setter Injection");
    }

    public void startJourney() {
        myVehicle.start();
    }


}
