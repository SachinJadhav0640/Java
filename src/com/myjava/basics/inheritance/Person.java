package com.myjava.basics.inheritance;

/*Assignment 3: Inherit and Extend with Person and Student
Problem: Create a Person class with name and age. Create a Student class that inherits from Person,
        adds a grade field, and overrides a method to display details. Test in main.*/

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void displayDetails(){
        System.out.println("Name: " +  name + " age: " + age);
    }
}
class Student extends Person {
    private char grade;

    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name , age);
        this.subject=subject;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: "+subject);
    }
}
class main {
    public static void main(String[] args) {
        Student student = new Student("Sachin" , 21, 'A');
        student.displayDetails();
        System.out.println();

        Teacher teacher = new Teacher("Mrs Sharma" , 40, "Science");
        teacher.displayDetails();
    }
}

/*Explanation:
Student inherits name and age from Person.
super(name, age) initializes the parent’s fields.
displayDetails is overridden to include the grade.
Practice Tip: Add a Teacher class that extends Person and adds a subject field.*/
