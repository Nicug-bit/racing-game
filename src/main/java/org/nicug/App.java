package org.nicug;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.metal.MetalComboBoxUI;

public class App
{
    public static void main( String[] args )
    {
       Car carReference = new Car ();
       carReference.name = "Ferrari";
       carReference.maxSpeed = 300;
       carReference.totalTraveledDistance = 0;
       carReference.damaged = false;
       carReference.doorCount = 1;
       carReference.color = "Red";

        Engine engine1 = new Engine();
        engine1.manufacturer = "Ferrari";
        engine1.capacity = 3000;

     System.out.println(carReference);


        carReference.engine = engine1;

        System.out.println("Engine1 capacity: " + engine1.capacity);
        System.out.println("Car engine capacity: " + carReference.engine.capacity);


        engine1.capacity  = 4000;

        System.out.println("Car engine capacity after update: " + carReference.engine.capacity);



        // concatenation
        System.out.println("Properties of car " + carReference.name);
        System.out.println("Max speed: " + carReference.maxSpeed);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Total Travel Distance: " + carReference.totalTraveledDistance);
        System.out.println("Damaged: " + carReference.damaged);
        System.out.println("Door Count: " + carReference.doorCount);
        System.out.println("Color: " + carReference.color);
        Car car2 = new Car();
        car2.name = "Renault";
        car2.fuelLevel = 70;
        car2.maxSpeed = 300;
        car2.mileage = 10;
        car2.totalTraveledDistance = 100;

        car2.engine = new Engine();
        car2.engine.capacity = 2000;

        System.out.println("Car engine capacity: " +car2.engine.capacity);


        System.out.println("Properties of car " + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel level: " + car2.fuelLevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Total Travel Distance: " + car2.totalTraveledDistance);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Door Count: " + car2.doorCount);
        System.out.println("Color: " + car2.color);

        System.out.println("********************************************************************");

        double distanceForCar1 = carReference.accelerate(60,1);

        double distanceForCar2 = car2.accelerate(130,1);

       System.out.println("Engine manufacturer before repair: "+ carReference.engine.manufacturer);
       Mechanic mechanic = new Mechanic();
       mechanic.repair(carReference);
       System.out.println("Engine manufacturer after repair: "+ carReference.engine.manufacturer);




//        System.out.println("Initial name for car1: " + carReference.name);
//        carReference.name = "Audi";
//
//        System.out.println("Changed name for car1: " + carReference.name);
//
//        carReference = new Car();
//        System.out.println("Name of new car: " + carReference.name);
//        carReference.name = "BMW";
//
//
//        carReference = car2;
//        System.out.println("Name of car reference from 2 variables. CarReference: " + carReference.name);
//        System.out.println("Name of car reference from 2 variables. Car2: " + car2.name);
//
//        car2.name = "Dacia";
//        System.out.println("Updated name of car reference from 2 variables. CarReference: " + carReference.name);
//        System.out.println("Updated name of car reference from 2 variables. Car2: " + car2.name);
//
//        car2 = null;
//        System.out.println(carReference.name);


//        System.out.println("Modulo example:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//
//        if (4 % 2 == 0) {
//            System.out.println("4 is a even number");
//        }
    }
}
