package com.myjava.basics.polymorphism;

/*Assignment 6: Combining Polymorphism and Encapsulation with Product
Problem: Create a Product class with a private price field and an applyDiscount method. Create Electronics and Clothing
classes that inherit from Product and override applyDiscount. Use polymorphism in main.*/

public class Product {
    private double price;

    public Product(double price) {
        this.price=price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void applyDiscount() {
        price = price * 0.95; //5% Discount by default
    }
}
class Electronics extends Product {
    public Electronics(double price){
        super(price);
    }

    @Override
    public void applyDiscount() {
        setPrice(getPrice() * 0.90); //10% discount on Electronics
    }
}
class Clothing extends Product {
    public Clothing(double price){
        super(price);
    }
    @Override
    public void applyDiscount() {
        setPrice(getPrice() * 0.80); //20% discount on Electronics
    }
}
class ProductDiscountTest {
    public static void main(String[] args) {
        Product electronics = new Electronics(4999.99);
        Product clothing = new Clothing(1999.99);
        electronics.applyDiscount();
        clothing.applyDiscount();

        System.out.println("Electronics price after discount: " + electronics.getPrice());
        System.out.println("Clothing price after discount: " + clothing.getPrice());
    }
}

/*
Explanation: Combines encapsulation (private price with getters/setters) and polymorphism by
calling overridden applyDiscount methods via Product references.

Practice Tip: Add a Furniture class with a 15% discount.*/