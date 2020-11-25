package com.codehub.springcoreexamples.travel;

import com.codehub.springcoreexamples.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredInjectedTravel {

    //This is the dependency
    //No setter or constructor is needed
    //We need this annotation here to know where to Autowire
    @Autowired
    private Vehicle vehicle;

    public void startJourney() {
        vehicle.start();
    }
}
