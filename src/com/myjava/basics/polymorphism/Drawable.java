package com.myjava.basics.polymorphism;

/*Assignment 5: Polymorphic Method Parameter with Drawable Hierarchy
Problem: Create a Drawable class with a draw method. Create Circle and Square classes that inherit from Drawable
and override draw. Write a method that accepts a Drawable parameter.*/

public class Drawable {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle1 extends Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Square extends Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
class DrawingTest {
    public static void drawShape(Drawable drawable){
        drawable.draw(); // Polymorphic call
    }
    public static void main(String[] args) {
        Drawable circle = new Circle1();
        Drawable square = new Square();
        circle.draw(); // Calls Square's draw method
        square.draw(); // You are calling a method on that object
        drawShape(circle); // Calls Square's draw method via Polymorphic call
        drawShape(square); // You are passing an object to a method)
    }
}
/*
Explanation: Uses a Drawable parameter in drawShape to call overridden draw methods, showcasing polymorphism via method parameters.

Practice Tip: Add a Triangle class and pass it to drawShape*/
