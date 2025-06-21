package com.myjava.basics.encapsulation;

/*Assignment 5: Encapsulate a Student Class with Display Method
Problem: Create a Student class with private fields for id and grade.
        Add getters, setters, and a method to display details. Test in main.*/

public class StudentEncapsulated {
    private int id;
    private char grade;

    //constructor
    public StudentEncapsulated(int id , char grade) {
        this.id = id;
        this.grade = grade;
    }
    //getters
    public int getID() {
        return id;
    }
    public char getGrade() {
        return grade;
    }
    //setters
    public void setID(int id) {
        this.id=id;
    }
    public void setGrade(char grade) {
        this.grade=grade;
    }
    //methodToDisplay
    public void displayDetails() {
        System.out.println("Student ID: " + id + " Grade: " + grade);
    }
    //mainMethod
    public static void main(String[] args) {
        StudentEncapsulated student = new StudentEncapsulated(2162495 , 'T');
        student.displayDetails();

        //TestValidation
        student.setID(2030852);
        student.setGrade('S');
        student.displayDetails();
    }
}

/*Explanation:
Combines encapsulation with a method to display details.
Fields are private, accessed via getters and setters.
Practice Tip: Add validation to setGrade to ensure it’s a valid grade (e.g., ‘A’ to ‘Z’)*/