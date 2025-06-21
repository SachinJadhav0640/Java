package com.myjava.basics.polymorphism;

/*Assignment 2: Polymorphism with Shape and Area Calculation
Problem: Create a Shape class with a calculateArea method. Create Circle and Rectangle classes
that inherit from Shape and override calculateArea. Use a parent reference in main to call the method.*/

public class Shape {
    public double calculateArea() {
        return 0.0;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length , double width) {
        this.length = length;
        this.width = width;
    }
        @Override
        public double calculateArea() {
            return length * width;
    }
}
class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base , int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
class ShapeAreaTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle(12.2);
        Shape shape2 = new Rectangle(6 , 4);
        Shape shape3 = new Triangle(3 , 4);
        System.out.println("Area of Circle: " + shape1.calculateArea());
        System.out.println("Area of Rectangle: " + shape2.calculateArea());
        System.out.println("Area of Triangle: " + shape3.calculateArea());
    }
}

/*
Explanation: Uses Shape references to call overridden calculateArea methods in Circle and Rectangle, showcasing polymorphic behavior.

Practice Tip: Add a Triangle class with calculateArea (area = 0.5 * base * height)*/