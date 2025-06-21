package com.myjava.basics.encapsulation;

/*Assignment 6: Encapsulate a Product Class with Price Update Logic
Problem: Create a Product class with private fields for name and price.
        Add getters, setters, and a method to apply a discount to the price. Test in main.*/

public class Product {
    private String name;
    private double price;
    //constructor
    public Product(String name , double price) {
        this.name = name;
        this.price =  price;
    }
    //getters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        } else {
            System.out.println("Price Value cannot be negative");
        }
    }
    //method to apply discount
    public void applyDiscount(double percentage) {
        if (percentage>=0 && percentage<=100) {
            double discount = price * (percentage/100);
            price -= discount;
            System.out.println("Discount of " + percentage + " % is successfully applied. New Price is: " + price);
        } else {
            System.out.println("Error: Discount percentage should be between 0 and 100");
        }
    }

    public static void main(String[] args) {
        Product pc1 =  new Product("Book" , 323.23);
        System.out.println("Product: " + pc1.getName() + ", Price: " + pc1.getPrice());

        //ApplyDiscount
        pc1.applyDiscount(50);
        pc1.applyDiscount(150);
        pc1.setName("Laptop");
        pc1.setPrice(29999);
        pc1.applyDiscount(10);
    }
}
/*
Explanation:

Encapsulates name and price with getters and setters.
Adds a method applyDiscount that modifies the price with validation.
Practice Tip: Add a method increasePrice to increase the price by a percentage.*/
