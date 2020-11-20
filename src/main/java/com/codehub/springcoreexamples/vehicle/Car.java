package com.codehub.springcoreexamples.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void start() {
        System.out.println("Travelling by Car");
    }

}
