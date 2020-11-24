package com.codehub.springcoreexamples.travel;

import com.codehub.springcoreexamples.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredInjectedTravel {

    //This is the dependency
    //No setter or constructor is needed
    @Autowired
    private Vehicle vehicle;

    //Autowire by constructor will be preferred by Spring if both setter and constructor are present
//    public AutowiredInjectedTravel(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        System.out.println("Using Constructor Injection - Autowired");
//    }

//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        System.out.println("Using Setter Injection - Autowired");
//    }

    public void startJourney() {
        vehicle.start();
    }
}
