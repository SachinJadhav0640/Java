package com.myjava.basics.interfaces;

/*Assignment 1: Interface with Flyable Behavior
Problem: Create a Flyable interface with a fly method.
Create Bird and Airplane classes that implement Flyable. Use an interface reference to call the method in main.*/

// Interface defining a contract for flying behavior
public interface Flyable {
    // Abstract method that all implementing classes must define
    void fly();
}
// Class implementing Flyable interface
class Bird implements Flyable {
    public void fly() {
        // Bird's specific implementation of fly
        System.out.println("Bird flies with wings");
    }
}
// Another class implementing Flyable
class Airplane implements Flyable {
    @Override
    public void fly() {
        // Airplane's specific implementation
        System.out.println("Airplane flies with engines");
    }
}
class Drone implements Flyable {
    @Override
    public void fly() {
        System.out.println("Drone flies with propellers");
    }
}
class FlyableTest {
    public static void PolymorphicCall (Flyable flyable) {
        flyable.fly(); // Polymorphic call
    }
    public static void main(String[] args) {
        // Using interface reference to point to Bird's object
        Flyable bird = new Bird();
        // Using interface reference for Airplane's object
        Flyable airplane = new Airplane();
        Flyable drone = new Drone();
        bird.fly(); // Polymorphic call: invokes Bird's fly method
        airplane.fly(); // Polymorphic call: invokes Airplane's fly method
        PolymorphicCall(drone);
    }
}
/*
Explanation: Demonstrates interface implementation: Bird and Airplane implement Flyable, with
Flyable references enabling polymorphic method calls.

Practice Tip: Add a Drone class implementing Flyable with “Drone flies with propellers”*/
