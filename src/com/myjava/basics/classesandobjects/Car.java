package com.myjava.basics.classesandobjects;

/*Assignment 3: Create a Car Class with Default Constructor
Problem: Create a Car class with fields for brand and speed. Add a default constructor
        (no parameters) that sets default values. Add a method to display details. Create an object in main*/

/*public class car {
    String brand;
    int speed;

    // Default Constructor
    public car() {
        this.brand = "Toyota";
        this.speed = 160;
    }
    //Method to display details
    public void displayDetails() {
        System.out.println("Brand is: " + brand + " and speed is: " + speed);
    }

    public static void main(String[] args) {
        car details = new car();
        details.displayDetails();
    }
}*/

public class Car {
    String brand;
    int speed;

    // Default Constructor
    public Car() {
        this.brand = "Toyota";
        this.speed = 160;
    }

    // Parameterized Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Brand is: " + brand + " and speed is: " + speed);
    }

    public static void main(String[] args) {
        Car defaultCar = new Car();
        defaultCar.displayDetails();

        // Creating another object with custom values
        Car customCar = new Car("Honda", 180);
        customCar.displayDetails();
    }
}

/*
Explanation:

Defines a Car class with a default constructor that sets default values.
Adds a method to display the car’s details.
Creates an object using the default constructor.
Practice Tip: Add a parameterized constructor to set custom values for brand and speed, then create another object.*/
