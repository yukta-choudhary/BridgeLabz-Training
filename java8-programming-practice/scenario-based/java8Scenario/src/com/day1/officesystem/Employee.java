package com.day1.officesystem;
public class Employee {

    String name;
    double salary;
    int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name + " | Salary: " + salary + " | Experience: " + experience + " years";
    }
}

