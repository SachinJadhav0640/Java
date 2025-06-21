package com.myjava.basics.interfaces;

/*Assignment 4: Interface for Drivable Vehicles
Problem: Create a Drivable interface with a drive method. Create Car and Truck classes implementing Drivable. Use an interface reference in main.*/

public interface Drivable {
    // Abstract method for driving
    void drive();
}
class Car implements Drivable{
    public void drive(){
        System.out.println("Car is on the Highway");
    }
}
class Truck implements Drivable{
    @Override
    public void drive() {
        System.out.println("Truck is on the road");
    }
}
class Motorcycle implements Drivable{
    @Override
    public void drive() {
        System.out.println("Motorcycle is cruising");
    }
}
class DrivableTest {
    public static void main(String[] args) {
        Drivable car = new Car();
        car.drive(); // Polymorphic call for Car
        Drivable truck = new Truck();
        truck.drive(); // Polymorphic call for Truck
        Drivable motorcycle = new Motorcycle();
        motorcycle.drive();
    }
}
/*
Explanation: Uses Drivable references for polymorphic drive calls, showing interfaces define behavior contracts.

Practice Tip: Add a Motorcycle class implementing Drivable with “Motorcycle is cruising”.*/
