package com.codehub.springcoreexamples;

import com.codehub.springcoreexamples.travel.ConstructorInjectedTravel;
import com.codehub.springcoreexamples.travel.PropertyInjectedTravel;
import com.codehub.springcoreexamples.travel.SetterInjectedTravel;
import com.codehub.springcoreexamples.travel.Travel;
import com.codehub.springcoreexamples.vehicle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreExamplesApplication.class, args);

        Travel myTravel = new Travel();
        myTravel.setMyVehicle(new Car());
        myTravel.startJourney();

        //Constructor Injection
        //When I instantiate the object I pass to it it's dependency (SAFE, BUT NEEDS CONSTRUCTOR WITH THIS/THESE ARGUMENTS)
        ConstructorInjectedTravel constructorInjectedTravel = new ConstructorInjectedTravel(new Car());
        constructorInjectedTravel.startJourney();

        //Setter Injection
        //After instantiation I use a setter method to pass the dependency (LESS SAFE, MORE CONVENIENT)
        SetterInjectedTravel setterInjectedTravel = new SetterInjectedTravel();
        setterInjectedTravel.setVehicle(new Car());
        setterInjectedTravel.startJourney();

        //Property Injection
        //After instantiation I access the property directly to pass a value (DANGEROUS, I NEED NO-PRIVATE PROPERTY)
        PropertyInjectedTravel propertyInjectedTravel = new PropertyInjectedTravel();
        propertyInjectedTravel.myVehicle = new Car();
        propertyInjectedTravel.startJourney();
    }
}
