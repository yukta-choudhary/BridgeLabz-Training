package com.lambdaexpression.nameuppercasing;

import java.util.*;

public class UppercaseMain {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul"),
                new Employee("Asha"),
                new Employee("Shraddha"),
                new Employee("Rashi")
        );

        employees.stream()
                 .map(Employee::getName)
                 .map(String::toUpperCase)      // convert to uppercase
                 .forEach(System.out::println);
    }
}
