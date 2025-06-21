package com.myjava.basics.encapsulation;

/*Assignment 1: Encapsulate a Person Class
Problem: Create a Person class with private fields for name and age.
Add a constructor, getters, and setters. Test by creating an object in main.*/

public class PersonEncapsulated {
    private String name;
    private int age;

    //constructor
    public PersonEncapsulated(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //mainMethod
    public static void main(String[] args) {
        PersonEncapsulated person = new PersonEncapsulated("Sachin",26);
        System.out.println("Person name: " +person.getName() +" and age: " + person.getAge());

        person.setName("Alice");
        person.setAge(24);
        System.out.println("Person name: " +person.getName() +" and age: " + person.getAge());
    }
}

/*
Explanation:

Fields name and age are private, so they can’t be accessed directly (e.g., person.name would cause an error).
Getters (getName, getAge) and setters (setName, setAge) provide controlled access.
Practice Tip: Try accessing person.name directly to see the error, then use the getter to fix it.*/
