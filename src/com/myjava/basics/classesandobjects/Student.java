package com.myjava.basics.classesandobjects;

/*6 Practice Assignments for Classes and Objects
The Classes and Objects topic involves creating classes, objects, constructors, and using the this keyword.
These assignments will help you understand object-oriented programming in Java.

Assignment 1: Create a Student Class with Basic Details
Problem: Create a Student class with fields for name and age. Add a constructor and a method to display
the details. Create an object in main and call the method.*/

public class Student {
    String name;
    int age;

    //Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to display details
    public void displayDetails() {
        System.out.println("Student name is " + name + " and age is " + age);
    }

    public static void main(String[] args) {
        Student student = new Student("Sachin", 26);
        student.displayDetails();
    }
}

/*
Explanation:

Defines a Student class with instance variables name and age.
Uses a constructor to initialize the fields, with this to avoid naming conflicts.
Creates an object and calls the displayDetails method.
Practice Tip: Create another Student object with different values and call displayDetails.*/
