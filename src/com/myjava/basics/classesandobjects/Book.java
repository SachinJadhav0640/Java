package com.myjava.basics.classesandobjects;

/*Assignment 4: Create a Book Class with Multiple Constructors
Problem: Create a Book class with fields for title and price. Add two constructors: one with both fields,
one with only title (default price to 0). Add a method to display details. Test both constructors in main.*/

public class Book {
    String title;
    double price;
    // Constructor with title and price
    public Book(String title , double price) {
        this.title = title;
        this.price = price;
    }
    // Constructor with title and default price
    public Book(String title) {
        this.title = title;
        this.price = 121.56;
    }
    // Method to display the details.
    public void displayDetails() {
        System.out.println("Title: " + title + " Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Alchemist" , 256.76);
        Book bookTitle = new Book("Think Like a Monk");
        book.displayDetails();
        bookTitle.displayDetails();
    }
}

/*
Explanation:

Defines a Book class with two constructors (constructor overloading).
Uses this to initialize fields.
Tests both constructors by creating two objects.
Practice Tip: Modify book2’s price after creation (e.g., book2.price = 15.99) and display again*/
