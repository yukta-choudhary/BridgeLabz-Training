package com.inheritance.employeemanagementsystem;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Manager();
        emp.name = "Amit";
        emp.id = 101;
        emp.salary = 80000;

        ((Manager) emp).teamSize = 5;
        emp.displayDetails();
    }
}
