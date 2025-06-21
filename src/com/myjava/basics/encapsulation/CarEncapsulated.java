package com.myjava.basics.encapsulation;

/*Assignment 4: Encapsulate a Car Class with Validation
Problem: Create a Car class with private fields for brand and speed. Add getters and setters,
with validation in the setter for speed (must be between 0 and 200). Test in main.*/

public class CarEncapsulated {
    private String brand;
    private int speed;

    //constructor
    public CarEncapsulated(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }
    //getters
    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }
    //setters
    public void setBrand(String brand) {
        this.brand=brand;
    }
    public void setSpeed(int speed) {
        if (speed >= 0 && speed<=200) {
            this.speed=speed;
        } else {
            System.out.println("Error: Speed must be between 0 to 200. Setting Speed to 0(Zero)");
            this.speed = 0;
        }
    }

    public static void main(String[] args) {
        CarEncapsulated car = new CarEncapsulated("Mercedes" , 200);
        System.out.println("Brand: " + car.getBrand() + " Speed: " + car.getSpeed());

        //TestValidation
        car.setBrand("BMW");
        car.setSpeed(250);
        System.out.println("Brand: " + car.getBrand() + " Speed: " + car.getSpeed());

        car.setBrand("KIA");
        car.setSpeed(160);
        System.out.println("Brand: " + car.getBrand() + " Speed: " + car.getSpeed());
    }
}
/*
Explanation:

speed setter validates that the value is between 0 and 200.
Fields are private, ensuring all access goes through getters and setters.
Practice Tip: Add validation to setBrand to ensure it’s not empty or null.*/