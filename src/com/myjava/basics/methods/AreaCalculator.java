package com.myjava.basics.methods;

/*Assignment 4: Method Overloading for Area Calculation
Problem: Write two methods with the same name calculateArea: one to calculate the area of a square (given the side)
and another for a rectangle (given length and width). Call both methods from main.*/

public class AreaCalculator {
    public static void main(String[] args) {
       int squareSide = 4;
       int rectangleLength = 4;
       int rectangleWidth = 2;

       int squareArea = calculateArea(squareSide);
       int rectangleArea = calculateArea(rectangleLength, rectangleWidth);

        System.out.println("Area of Square is " + squareArea);
        System.out.println("Area of Rectangle is " + rectangleArea);
    }

    public static int calculateArea(int side) {
        return side * side;
    }
    public static int calculateArea(int length, int width) {
        return length * width;
    }
}

/*
Explanation:

Demonstrates method overloading by defining two calculateArea methods with different parameter lists.
The first method takes one parameter (for a square), the second takes two (for a rectangle).
Calls both methods from main to show how overloading works.
Practice Tip: Add a third overloaded method to calculate the area of a circle (use Math.PI and take a radius parameter).*/
