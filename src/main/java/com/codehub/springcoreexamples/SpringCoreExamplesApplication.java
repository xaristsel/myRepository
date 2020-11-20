package com.codehub.springcoreexamples;

import com.codehub.springcoreexamples.config.VehicleConfig;
import com.codehub.springcoreexamples.vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreExamplesApplication.class, args);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(VehicleConfig.class);
		Vehicle vehicle1 = applicationContext.getBean("bike", Vehicle.class);
		Vehicle vehicle2 = applicationContext.getBean("myCar", Vehicle.class);
		Vehicle vehicle3 = applicationContext.getBean("bikeVehicle", Vehicle.class);
		Vehicle vehicle4 = applicationContext.getBean("carVehicle", Vehicle.class);

		vehicle1.start();
		vehicle2.start();
		vehicle3.start();
		vehicle4.start();


	}

}
