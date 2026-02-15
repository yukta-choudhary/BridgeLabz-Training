package com.conversionques.objectcollection;
import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class EmployeeById {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Amit", "IT", 50000),
                new Employee(2, "Neha", "HR", 40000)
        );

        Map<Integer, Employee> map =
                list.stream()
                    .collect(Collectors.toMap(e -> e.id, e -> e));

        System.out.println(map);
    }
}
