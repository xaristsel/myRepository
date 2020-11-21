package com.codehub.springcoreexamples.vehicle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Travelling by Bike");
    }

}
