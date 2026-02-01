package com.day1.officesystem;

import java.util.*;
import java.util.function.*;

public class EmployeeLambdaDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 28000, 2),
                new Employee("Anita", 45000, 5),
                new Employee("Suresh", 32000, 4),
                new Employee("Neha", 25000, 1)
        );

        /* 1. Calculate employee bonus (salary > 30000) */
        System.out.println("Bonus Eligibility:");
        Predicate<Employee> bonusCheck = e -> e.salary > 30000;
        employees.forEach(e ->
                System.out.println(e.name + " bonus eligible? " + bonusCheck.test(e))
        );

        /* 2. Sort employees by salary */
        System.out.println("\nEmployees sorted by salary:");
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        employees.forEach(System.out::println);

        /* 3. Promotion eligibility (experience > 3 years) */
        System.out.println("\nPromotion Eligibility:");
        Predicate<Employee> promotionCheck = e -> e.experience > 3;
        employees.forEach(e ->
                System.out.println(e.name + " promotion eligible? " + promotionCheck.test(e))
        );

        /* 4. Print employee details */
        System.out.println("\nEmployee Details:");
        Consumer<Employee> printEmployee = e -> System.out.println(e);
        employees.forEach(printEmployee);

        /* 5. Compare two employees’ salaries */
        System.out.println("\nEmployee with higher salary:");
        BiFunction<Employee, Employee, Employee> higherSalary =
                (e1, e2) -> e1.salary > e2.salary ? e1 : e2;

        Employee result = higherSalary.apply(employees.get(0), employees.get(1));
        System.out.println(result);
    }
}

