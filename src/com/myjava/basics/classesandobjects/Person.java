package com.myjava.basics.classesandobjects;

/*Assignment 6: Create a Person Class with Object Interactions
Problem: Create a Person class with fields for name and age. Add a constructor and a method introduce that
prints a greeting.Create two Person objects in main and make them introduce themselves.*/

public class Person {
    String name;
    int age;
    //Constructor
    public Person(String name , int age) {
        this.name = name;
        this.age = age;
    }
    //Method
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old");
    }
    public void sayHelloTo(Person otherPerson) {
        System.out.println(name + " says: Hello, " + otherPerson.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Sachin" , 26);
        Person person2 = new Person("Ravi" , 54);
        person1.introduce();
        person2.introduce();
        person1.sayHelloTo(person2);
        person2.sayHelloTo(person1);
    }
}

/*
Explanation:

Defines a Person class with a constructor and an introduce method.
Creates two objects to show how multiple objects work.
Each object has its own state (name, age).
Practice Tip: Add a method sayHelloTo(Person other) where one person greets another
    (e.g., person1.sayHelloTo(person2) prints “Sachin says: Hello, Alice!”).*/
