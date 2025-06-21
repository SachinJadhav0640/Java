package com.myjava.basics.interfaces;

/*Assignment 6: Interface with Rentable Items
Problem: Create a Rentable interface with rent and returnItem methods. Create Bike and Scooter classes implementing Rentable.
Use encapsulation and interface references in main.*/

interface Rentable {
    void rent();
    void returnItem();
}
class Bike implements Rentable {
    private String model;
    private boolean isRented;

    // Constructor to initialize model
    public Bike(String model){
        this.model=model;
        this.isRented = false;
    }
    @Override
    public void rent(){
        if(!isRented){
            isRented=true;
            System.out.println(model + " Bike has been rented");
        } else {
            System.out.println(model + " Bike is not available for Rent");
        }
    }
    @Override
    public void returnItem(){
        if(isRented){
            isRented = false;
            System.out.println(model + " Bike has been returned");
        }else {
            System.out.println(model + " Bike was not returned");
        }
    }
}
class Scooter implements Rentable{
    private String model;
    private boolean isRented;

    public Scooter(String model){
        this.model=model;
        this.isRented=false;
    }
    @Override
    public void rent() {
        if(!isRented){
            isRented= true;
            System.out.println(model + " Scooter has been rented");
        } else {
            System.out.println(model + " Scooter is not available for renting");
        }
    }
    @Override
    public void returnItem() {
        if(isRented){
            isRented=false;
            System.out.println(model + " Scooter has been returned");
        } else {
            System.out.println(model + " Scooter was not returned");
        }
    }
}
class RentableTest {
    public static void main(String[] args) {
        // Interface reference to Bike
        Rentable bike = new Bike("Pulsar 150");
        bike.rent();
        bike.rent(); //Try renting again
        bike.returnItem();
        bike.returnItem();
        bike.rent();
        Rentable scooter = new Scooter("Honda Activa");
        scooter.returnItem();
        scooter.rent();
        scooter.rent();
    }
}
/*
Explanation: Combines encapsulation (private fields) and interfaces: Bike and Scooter implement Rentable with state tracking for rentals.

Practice Tip: Add a Car class implementing Rentable with similar rent/return logic.*/
