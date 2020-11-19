package com.codehub.springcoreexamples;

import com.codehub.springcoreexamples.vehicle.Car;

public class Travel {

    Car car = new Car();
    //Bike bike = new Bike();
    /*
        We need to initiliaze Car, or Bike, or any other Vehicle object with all its properties right at this point,
        ensuring appropriate instantiation
     */


    public void startJourney() {
        car.drive();
        //bike.ride();
        /*
            What should happen in order to make a journey by Bike?
            How is Travel coupled with the various vehicles?
         */
    }

}
