package com.myjava.advanced;

/*Assignment 2: Abstract Vehicle Class
Problem: Create an abstract Vehicle class with an abstract
start method and a concrete stop method. Create Car and Bike subclasses to implement start. Test in main.*/

abstract class Vehicle {
    // Abstract method for starting (must be implemented)
    abstract void start();
    // concrete methods for stopping common for all
    void stop(){
        System.out.println("Vehicle stopped");
    }
}
// Subclass implementing Vehicle
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car engine started");
    }
}
class  Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike engine started");
    }
}
class VehicleTest{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
    }
}

/*
Explanation: The abstract Vehicle class combines an abstract start method with a concrete stop method, showing how abstract classes can provide shared functionality.

Practice Tip: Add a field for speed and an abstract method to update it.*/
