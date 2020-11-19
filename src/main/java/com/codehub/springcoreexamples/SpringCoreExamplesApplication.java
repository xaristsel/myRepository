package com.codehub.springcoreexamples;

import com.codehub.springcoreexamples.vehicle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreExamplesApplication.class, args);

		Travel myTravel = new Travel();
		myTravel.setMyVehicle(new Car()); //what happens if we comment this line?
		myTravel.startJourney();
	}

}
