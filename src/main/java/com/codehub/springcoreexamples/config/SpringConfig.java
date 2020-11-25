package com.codehub.springcoreexamples.config;

import com.codehub.springcoreexamples.travel.AutowiredInjectedTravel;
import com.codehub.springcoreexamples.travel.ConstructorInjectedTravel;
import com.codehub.springcoreexamples.travel.SetterInjectedTravel;
import com.codehub.springcoreexamples.vehicle.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// This annotation makes the magic happen.
@Configuration
public class SpringConfig {

    //    Bean declaration
    @Bean(name = "bike")
    public Bike getBike() {
        return new Bike();
    }

//    @Bean(name = "car")
//    public Car getCar() {
//        return new Car();
//    }

    //    Setter Injection
    @Bean(name = "setterInjectedTravel")
    public SetterInjectedTravel getSetterInjectedTravel() {
        SetterInjectedTravel setterInjectedTravel = new SetterInjectedTravel();
        setterInjectedTravel.setVehicle(getBike());
        return setterInjectedTravel;
    }

    //    Constructor Injection
    @Bean(name = "constructorInjectedTravel")
    public ConstructorInjectedTravel getCustomerService() {
        ConstructorInjectedTravel constructorInjectedTravel = new ConstructorInjectedTravel(getBike());
        return constructorInjectedTravel;
    }

    //    Use autowire with this bean, the same with bean declaration
    @Bean(name = "autowiredInjectedTravel")
    public AutowiredInjectedTravel getAutowiredInjectedTravel() {
        return new AutowiredInjectedTravel();
    }

}
