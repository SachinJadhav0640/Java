package com.myjava.basics.polymorphism;

/*Assignment 1: Runtime Polymorphism with Animal and Subclasses
Problem: Create an Animal class with a sound method. Create Dog and Cat classes
that inherit from Animal and override sound. Use a parent reference to call the method dynamically in main.*/

public class Animal {
    public void sound() {
        System.out.println("Animal makes the sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dor Barks: Woof!.");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat Meows: Meow!.");
    }
}
class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Bird chirps: Tweet!”.");
    }
}
class AnimalSoundTest {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Parent reference to Dog object
        Animal animal2 = new Cat();
        Animal animal3 = new Bird();
        animal3.sound();
        animal1.sound();
        animal2.sound();

    }
}
/*
Explanation: Demonstrates runtime polymorphism: Animal references (animal1, animal2) point to Dog and Cat objects.
The correct sound method is called based on the actual object type at runtime.

Practice Tip: Add a Bird class that extends Animal and overrides sound to print “Bird chirps: Tweet!”.*/
