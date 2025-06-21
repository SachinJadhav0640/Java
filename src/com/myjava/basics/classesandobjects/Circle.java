package com.myjava.basics.classesandobjects;

/*Assignment 5: Create a Circle Class with Method to Calculate Circumference
Problem: Create a Circle class with a field for radius. Add a constructor and a method to calculate the
circumference (use Math.PI). Create an object in main and print the circumference.*/

public class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double AreaOfCircle() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(6);
        double circumference = circle.calculateCircumference();
        double area = circle.AreaOfCircle();
        System.out.println("Circumference of circle is " + circumference);
        System.out.println("Area of Circle is " + area);
    }
}

/*
Explanation:

Defines a Circle class with a radius field.
Adds a method calculateCircumference that uses Math.PI.
Creates an object and calls the method.
Practice Tip: Add a method to calculate the area (Math.PI * radius * radius) and print it.*/