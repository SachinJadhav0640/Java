package com.myjava.basics.inheritance;

/*Assignment 5: Multi-Level Inheritance with Animal, Mammal, and Cat
Problem: Create an Animal class, a Mammal class that inherits from Animal, and a Cat class that inherits from Mammal.
Add a method to display traits at each level. Test in main.*/

public class Animals {
    public void traits() {
        System.out.println("This is a Animal Class");
    }
}
class Mammal extends Animals {
    @Override
    public void traits() {
        super.traits();
        System.out.println("This is a mammal: warm-blooded.");
    }
}
class Cat1 extends Mammal {
    @Override
    public void traits() {
        super.traits();
        System.out.println("This is a cat: meows and has whiskers.");
    }
}
class Dog1 extends Mammal {
    @Override
    public void traits() {
        super.traits();
        System.out.println("This is a dog: barks and human friendly.");
    }
}
class Main2 {
    public static void main(String[] args) {
        Cat1 cat = new Cat1();
        cat.traits();
        System.out.println("---------------------------------------------");
        Dog1 dog = new Dog1();
        dog.traits();
        System.out.println("---------------------------------------------");
        Animals animal = new Animals();
        animal.traits();
    }
}
/*
Explanation:

Demonstrates multi-level inheritance: Cat → Mammal → Animal.
        Each class overrides traits and uses super to call the parent’s method.
Practice Tip: Add a Dog class that extends Mammal and overrides traits.*/
