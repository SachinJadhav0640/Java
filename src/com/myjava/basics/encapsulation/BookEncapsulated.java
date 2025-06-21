package com.myjava.basics.encapsulation;

/*Assignment 3: Encapsulate a Book Class with Read-Only Field
Problem: Create a Book class with private fields for title and price.
Make title read-only (no setter). Add getters and a setter for price. Test in main.*/

public class BookEncapsulated {
    private String BookTitle;
    private double price;

    //Constructor
    public BookEncapsulated(String title , double price) {
        this.BookTitle = title;
        this.price =  price;
    }
    //getters
    public String getTitle() {
        return BookTitle;
    }
    public double getPrice() {
        return price;
    }
    //setters
    public void setPrice(double price) {
        this.price=price;
    }
    public void setBookTitle(String title) {
        this.BookTitle=title;
    }
    //MainMethod
    public static void main(String[] args) {
        BookEncapsulated book = new BookEncapsulated("Atomic Habits",234.56);
        System.out.println("Title: " + book.getTitle() + " price: " + book.getPrice());

        //update price
        book.setBookTitle("Rich Dad Poor Dad");
        book.setPrice(321.11);
        System.out.println("Title: " + book.getTitle() + " price: " + book.getPrice());
    }
}
/*
Explanation:

title is read-only because there’s no setter—once set in the constructor, it can’t be changed.
price has both a getter and a setter for flexibility.
Practice Tip: Try adding a setter for title and see how it changes the behavior.*/