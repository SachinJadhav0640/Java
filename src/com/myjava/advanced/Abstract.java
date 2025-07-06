package com.myjava.advanced;

/*Assignment 1: Abstract Shape Class
Problem: Create an abstract Shape class with an abstract calculateArea method.
Create Circle and Rectangle subclasses to implement it. Test using parent references in main.*/

// Abstract class defining a shape
abstract class Shape{
    // Abstract method to be implemented by subclasses
    abstract double calculateArea();
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    // Implement abstract method
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}
class Shapetest{
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        System.out.println("Area of Circle is: " + shape1.calculateArea());
        Shape shape2 = new Rectangle(12, 34);
        System.out.println("Area of Rectangle: " + shape2.calculateArea());
    }
}

/*
Explanation: The abstract Shape class defines a contract with calculateArea, implemented differently by Circle and Rectangle.
Parent references enable polymorphism.

Practice Tip: Add an abstract calculatePerimeter method and implement it for both subclasses.*/
