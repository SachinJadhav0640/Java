package com.myjava.basics.inheritance;

/*Assignment 2: Use super to Access Parent Method in Animal and Dog
Problem: Create an Animal class with a sound method. Create a Dog class that inherits from Animal,
        overrides sound, and uses super to call the parent’s sound. Test in main.*/

public class Animal {
    public void sound() {
        System.out.println("Animal makes the sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog barks: Woof!.");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Cat meows: Meows!.");
    }
}
class Main {

public static void main(String[] args) {
    Dog dog = new Dog();
    dog.sound();
    Cat cat =  new Cat();
    cat.sound();
}
}
/*
Explanation:

Dog inherits from Animal and overrides the sound method.
super.sound() calls the parent’s version of the method.
Practice Tip: Add a Cat class that also extends Animal and overrides sound to print “Cat meows: Meow!”.*/
