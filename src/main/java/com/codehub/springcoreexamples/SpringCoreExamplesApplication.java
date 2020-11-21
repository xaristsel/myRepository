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
		Vehicle vehicleCarBean = applicationContext.getBean("car", Vehicle.class);
		Vehicle anotherVehicleCarBean = applicationContext.getBean("car", Vehicle.class);

		//check equality on beans of scope singleton
		boolean isSingletonBeansPointingToSameRef = (vehicleCarBean == anotherVehicleCarBean);
		System.out.println("Pointing to the same location: " + isSingletonBeansPointingToSameRef);
		System.out.println("Object location of carBean " + vehicleCarBean);
		System.out.println("Object location of anotherCarBean " + anotherVehicleCarBean);

		//retrieve bean from spring container
		Vehicle bikeBean = applicationContext.getBean("bike", Vehicle.class);

		//retrieve the same bean and assign to a different object
		Vehicle anotherBikeBean = applicationContext.getBean("bike", Vehicle.class);

		//check equality on beans of scope prototype
		boolean isPrototypeBeansPointingToSameRef = (bikeBean == anotherBikeBean);
		System.out.println("Pointing to the same location: " + isPrototypeBeansPointingToSameRef);
		System.out.println("Object location of bikeBean " + bikeBean);
		System.out.println("Object location of anotherBikeBean " + anotherBikeBean);

		//call methods on the bean
		vehicleCarBean.start();
		anotherVehicleCarBean.start();

		bikeBean.start();
		anotherBikeBean.start();



	}

}
