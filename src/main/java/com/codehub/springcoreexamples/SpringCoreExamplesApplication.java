package com.codehub.springcoreexamples;

import com.codehub.springcoreexamples.vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreExamplesApplication.class, args);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Vehicle vehicle = applicationContext.getBean("bike", Vehicle.class);
		vehicle.start();

	}

}
