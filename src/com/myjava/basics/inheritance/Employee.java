package com.myjava.basics.inheritance;

/*Assignment 6: Inherit and Add Behavior with Employee and Manager
Problem: Create an Employee class with name and salary.
Create a Manager class that inherits from Employee, adds a department field, and overrides a method to include a bonus. Test in main.*/

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name , double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double calculatePay() {
        return salary;
    }
    public void displayInfo() {
        System.out.println("Employee Name: " + name + " \nSalary: " + salary);
        System.out.println("--------------------------------------------------");
    }
}
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary , String department) {
        super(name,salary);
        this.department = department;
    }
    @Override
    public double calculatePay() {
        double bonus = salary * 0.10; //10% Bonus for managers
        return salary + bonus;
    }
    @Override
    public void displayInfo() {
        System.out.println("Manager Name: " + name + " \nSalary: " + salary + " \nDepartment: " + department);
        System.out.println("--------------------------------------------------");
    }
}
class Engineer extends Employee {
    private String role;

    public Engineer(String name, double salary , String role) {
        super(name,salary);
        this.role = role;
    }
    @Override
    public double calculatePay() {
        double bonus = salary * 0.25; //25% Bonus for Engineers
        return salary + bonus;
    }
    @Override
    public void displayInfo() {
        System.out.println("Manager Name: " + name +  " \nSalary: " + salary + " \nRole: " + role);
//        System.out.printf("Manager Name: %s\nSalary: %.2f\nRole: %s\n", name, salary, role);

    }
    public static void main(String[] args) {
        Manager manager = new Manager("Elon Musk" , 50000 , "Innovation");
        manager.displayInfo();

        Employee emp = new Employee("Sachin" , 31825.60);
        emp.displayInfo();

        Engineer engineer = new Engineer("Alice" , 20000 , "Developer");
        engineer.displayInfo();
    }
}

/*Explanation:

Manager inherits from Employee and adds a department field.
Overrides calculatePay to include a bonus and displayInfo to show additional details.
Practice Tip: Add an Engineer class that extends Employee with a different bonus percentage*/