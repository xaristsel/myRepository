package com.codehub.springcoreexamples.vehicle;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Travelling by Bike");
    }

    public void initMethod() {
        System.out.println("Inside Bike's bean init method");
    }


    public void destroyMethod() {
        System.out.println("Inside Bike bean destroy method");
    }

}
