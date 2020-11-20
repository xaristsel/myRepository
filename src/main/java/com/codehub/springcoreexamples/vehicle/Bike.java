package com.codehub.springcoreexamples.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Travelling by Bike");
    }

}
