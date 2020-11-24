package com.codehub.springcoreexamples;

import com.codehub.springcoreexamples.travel.AutowiredInjectedTravel;
import com.codehub.springcoreexamples.travel.ConstructorInjectedTravel;
import com.codehub.springcoreexamples.travel.SetterInjectedTravel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreExamplesApplication.class, args);

        //We'll ask for an instance of each bean from the Application Context, as we have defined it in the XML
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

        //Constructor Injection
        // When SPRING FRAMEWORK instantiates the object
        // IT will pass to it it's dependency through the object's constructor
        // according to the defined configuration
        ConstructorInjectedTravel constructorInjectedTravel = (ConstructorInjectedTravel) ctx.getBean("constructorInjectedTravel");
        constructorInjectedTravel.startJourney();

        //Setter Injection
        // When SPRING FRAMEWORK instantiates the object
        // IT will pass to it it's dependency using the object's setter method
        // according to the defined configuration
        SetterInjectedTravel setterInjectedTravel = (SetterInjectedTravel) ctx.getBean("setterInjectedTravel");
        setterInjectedTravel.startJourney();

        //Autowired Injection
        // When SPRING FRAMEWORK instantiates the object
        // IT will find from the available beans a fitting dependency ad pass it to the object
        AutowiredInjectedTravel autowiredInjectedTravel = (AutowiredInjectedTravel) ctx.getBean("autowiredInjectedTravel");
        autowiredInjectedTravel.startJourney();



    }
}
