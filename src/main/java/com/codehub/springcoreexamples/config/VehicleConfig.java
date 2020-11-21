package com.codehub.springcoreexamples.config;

import com.codehub.springcoreexamples.vehicle.Bike;
import com.codehub.springcoreexamples.vehicle.Car;
import com.codehub.springcoreexamples.vehicle.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {

    @Bean
    public Vehicle myCar(){
        return new Car();
    }

    @Bean
    public Vehicle carVehicle(){
        return new Car();
    };

    @Bean
    public Vehicle bike(){
        return new Bike();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Vehicle bikeVehicle(){
        return new Bike();
    }

}
