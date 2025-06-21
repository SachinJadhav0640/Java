package com.myjava.basics.inheritance;

/*Assignment 4: Method Overriding with Shape and Rectangle
Problem: Create a Shape class with a calculateArea method that returns 0.
Create a Rectangle class that inherits from Shape, adds length and width, and overrides calculateArea. Test in main.*/

public class Shape {
    public double calculateArea() {
        return 0.0;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }
}
class Main1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.calculateArea();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Circle circle = new Circle(6.6);
        circle.calculateArea();
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}

/*
Explanation:

Rectangle inherits from Shape and overrides calculateArea to provide its own implementation.
Demonstrates method overriding, a key feature of inheritance.
Practice Tip: Add a Circle class that extends Shape and overrides calculateArea using Math.PI.*/
