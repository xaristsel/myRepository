package com.codehub.springcoreexamples.travel;

import com.codehub.springcoreexamples.vehicle.Vehicle;

public class AutowiredInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    //To Autowire byType or byName I need to have at my class a public setter method
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Setter Injection - Autowired");
    }

    //To Autowire by Constructor I need to have at my class the appropriate public constructor
    public AutowiredInjectedTravel(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Constructor Injection - Autowired");
    }

    public void startJourney() {
        vehicle.start();
    }
}
