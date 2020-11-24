package com.codehub.springcoreexamples.vehicle;

import org.springframework.stereotype.Component;

//This annotation is needed to tell spring that this is a bean.
@Component
public class Bike implements Vehicle{

    public void start() {
        System.out.println("Travelling by Bike");
    }

}
