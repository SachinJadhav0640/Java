package com.myjava.basics.polymorphism;

/*Assignment 3: Polymorphic Array with Employee and Subclasses
Problem: Create an Employee class with a calculateSalary method. Create FullTimeEmployee and PartTimeEmployee classes
that inherit from Employee and override calculateSalary. Use an array of Employee references in main.*/

public class Employee {
    protected String name;
    public Employee(String name) {
        this.name = name;
    }
    public double calculateSalary() {
        return 0.0;
    }
}
class FullTimeEmployee extends Employee {
    private double monthlysalary;
    public FullTimeEmployee(String name , double monthlysalary) {
        super(name);
        this.monthlysalary =  monthlysalary;
    }
    public double calculateSalary() {
        return monthlysalary;
    }
}
class PartTimeEmployee extends Employee {
    private double hourlyrate;
    private double hoursworked;
    public PartTimeEmployee(String name , double hourlyrate , double hoursworked) {
        super(name);
        this.hourlyrate =  hourlyrate;
        this.hoursworked =  hoursworked;
    }
    public double calculateSalary() {
        return hourlyrate * hoursworked;
    }
}
class EmployeeSalaryTest {
    public static void main(String[] args) {
        Employee[] employee = new Employee[2];
        employee[0] = new FullTimeEmployee("Alice" , 23000.56);
        employee[1] = new PartTimeEmployee("Bran" , 320 , 120);
        for (Employee emp : employee) {
            System.out.println("Salary of " + emp.name + ": " + emp.calculateSalary());
        }
    }
}

/*
Explanation: Uses an array of Employee references to call overridden calculateSalary methods,
demonstrating polymorphism with multiple objects.

Practice Tip: Add a ContractEmployee class with a fixed contract amount*/
