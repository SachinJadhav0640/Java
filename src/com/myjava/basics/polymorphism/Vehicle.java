package com.myjava.basics.polymorphism;

/*Assignment 4: Polymorphism with Vehicle and Behavior
Problem: Create a Vehicle class with a move method. Create Car and
Bicycle classes that inherit from Vehicle and override move. Use a parent reference in main.*/

public class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }
}
class VehicleMovementTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move();
        Vehicle bicycle = new Bicycle();
        bicycle.move();
    }
}

/*
Explanation: Uses Vehicle references to call overridden move methods in Car and Bicycle, illustrating polymorphic behavior.

Practice Tip: Add a Boat class with move printing “Boat is sailing on water”.*/
