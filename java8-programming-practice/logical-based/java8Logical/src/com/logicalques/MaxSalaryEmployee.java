package com.logicalques;
// Q28: Find employee with highest salary using stream

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class MaxSalaryEmployee {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "A", 50000),
                new Employee(2, "B", 75000),
                new Employee(3, "C", 60000)
        );

        Employee emp = list.stream()
                .max(Comparator.comparingDouble(e -> e.salary))
                .get();

        System.out.println(emp.name + " " + emp.salary);
    }
}
