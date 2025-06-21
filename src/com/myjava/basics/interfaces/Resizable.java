package com.myjava.basics.interfaces;

/*Assignment 2: Interface for Resizable Objects
Problem: Create a Resizable interface with a resize method.
Create Image and Window classes implementing Resizable. Use an interface reference in main.*/

//Interface for objects that can be resized
public interface Resizable {
    // Method to resize by a factor
    void resize(double factor);
}
class Image implements Resizable {
    // Private field for encapsulation
    private double size;

    //Constructor to initialize size
    public Image(double size) {
        this.size=size;
    }
    @Override
    public void resize(double factor) {
        // Update size and print new size
        this.size *= factor;
        System.out.println("Image resized to: " + size);
    }
}
class Window implements Resizable {
    private double size;
    public Window(double size) {
        this.size = size;
    }
    @Override
    public void resize (double factor) {
        this.size *= factor; //this.size = this.size * factor
        System.out.println("Window resized to: " + size);
    }
}
class TextBox implements Resizable {
    private double size;
    public TextBox(double size){
        this.size = size;
    }
    @Override
    public void resize (double factor){
        this.size *= factor;
        System.out.println("TextBox resized to: " + size);
    }
}
class resizableTest {
    public static void main(String[] args) {
        Resizable image = new Image(100.0);
        Resizable window = new Window(200.00);
        Resizable textbox = new TextBox(300.00);
        image.resize(1.5);
        window.resize(0.8);
        textbox.resize(0.5);
    }
}

/*
Explanation: Uses Resizable references for polymorphic resize calls, with Image fields showing encapsulation.

Practice Tip: Add a TextBox class implementing Resizable with a custom resize message.*/
