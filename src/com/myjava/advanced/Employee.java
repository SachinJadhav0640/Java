package com.myjava.advanced;

/*Assignment 3: Abstract Employee Class
Problem: Create an abstract Employee class with an abstract calculateBonus method.
Create Manager and Developer subclasses with different bonus logic. Test in main.*/

abstract class Employee {
    private String name;
    private double salary;

    //constructor
    public Employee(String name, double salary) {
        this.name=name;
        this.salary=salary;
    }
    abstract double calculateBonus();

    public double getSalary(){
        return salary;
    }
}
class Manager extends Employee{
    public Manager(String name, double salary){
        super(name,salary);
    }
    @Override
    double calculateBonus() {
        return getSalary() * 0.2;
    }
}
class Developers extends Employee{
    public Developers(String name, double salary){
        super(name,salary);
    }
    @Override
    double calculateBonus() {
        return getSalary() * 0.1;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Manager("Sachin", 10000);
        Employee emp2 = new Developers("Alice", 5000);

        System.out.println("Manager Bonus: " + emp1.calculateBonus());
        System.out.println("Developer Bonus: " + emp2.calculateBonus());
    }
}
