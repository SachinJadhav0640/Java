package com.myjava.basics.methods;

import java.util.Scanner;

/*Assignment 2: Print a Greeting Message
Problem: Write a method that takes a name as a parameter and prints a greeting message.
The method should not return anything.*/

public class Greeting {
    public static void main (String[] args) {
        Scanner m2 = new Scanner(System.in);
        System.out.println("Please Enter the name which needs to be displayed with greeting message");
        String name = m2.nextLine();
//        String name = "Sachin";
        printGreeting(name);
    }
    public static void printGreeting(String enteredName) {
        System.out.println("Hello, " + enteredName + "! How are you?");
    }
}

/*
Explanation:

Defines a void method printGreeting that takes a String parameter.
The method performs an action (printing) but doesn’t return a value.
Calls the method from main.
Practice Tip: Call the method with different names (e.g., "Alice", "Bob") to see different greetings.*/
