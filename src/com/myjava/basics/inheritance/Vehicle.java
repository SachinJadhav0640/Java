package com.myjava.basics.inheritance;

/*Assignment 1: Basic Inheritance with Vehicle and Car
Problem: Create a Vehicle class with a brand field and a displayInfo method. Create a Car class
that inherits from Vehicle and adds a model field. Test in main.*/

public class Vehicle {
    protected String brand;

    //constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }
    //method
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}
    //inheritance
    class Car extends Vehicle {
        private String model;

    public Car(String brand, String model) {
    super(brand);
    this.model = model;
    }
    public void displayInfo() {
    super.displayInfo();
        System.out.println("Model: " + model);
    }

        public static void main(String[] args) {
            Car car = new Car("Honda" , "City");
            car.displayInfo();
            Car car1 = new Car("Honda" ,  "Civic");
            car1.displayInfo();
        }
}

/*
Explanation:

Car inherits from Vehicle using extends.
        super(brand) calls the parent’s constructor.
displayInfo is overridden in Car to add model information.
Practice Tip: Create another Car object with different values and call displayInfo.*/
