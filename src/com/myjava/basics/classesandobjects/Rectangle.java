package com.myjava.basics.classesandobjects;

/*Assignment 2: Create a Rectangle Class with Area Method
Problem: Create a Rectangle class with fields for length and width. Add a constructor
and a method to calculate the area. Create an object in main and print the area.*/

public class Rectangle {
    int length;
    int width;
    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,2);
        int area = rectangle.calculateArea();
        System.out.println("Area of rectangle is: " + area);
    }
}
/*
public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Instance method to calculate area
    public void calculateArea() {
        int area = length * width;
        System.out.println("Area of rectangle is: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 2);
        rectangle.calculateArea();
    }
}*/

/*
Explanation:

Defines a Rectangle class with length and width fields.
Uses a constructor to initialize the fields.
Adds a method calculateArea to compute the area.
Practice Tip: Create another Rectangle with different dimensions and print its area.*/
