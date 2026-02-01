package com.day1.employeestream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

    // Employee class
    static class Employee {

        int id;
        String name;
        int age;
        String gender;
        String department;
        int yearOfJoining;
        double salary;

        public Employee(int id, String name, int age, String gender,
                        String department, int yearOfJoining, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.department = department;
            this.yearOfJoining = yearOfJoining;
            this.salary = salary;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getGender() { return gender; }
        public String getDepartment() { return department; }
        public int getYearOfJoining() { return yearOfJoining; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return name + " | " + department + " | " + salary;
        }
    }

    public static void main(String[] args) {

        // Employee data
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", 32, "Male", "HR", 2011, 25000),
            new Employee(2, "Neha", 28, "Female", "Sales", 2016, 28000),
            new Employee(3, "Ravi", 35, "Male", "Product Development", 2010, 40000),
            new Employee(4, "Priya", 26, "Female", "Product Development", 2018, 35000),
            new Employee(5, "Arjun", 30, "Male", "Sales", 2014, 22000),
            new Employee(6, "Kiran", 24, "Male", "Product Development", 2020, 18000),
            new Employee(7, "Sneha", 29, "Female", "HR", 2015, 30000)
        );

        // 1. Male and Female count
        System.out.println("1. Male & Female Count:");
        System.out.println(
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getGender, Collectors.counting()))
        );

        // 2. Department names
        System.out.println("\n2. Departments:");
        employees.stream()
                 .map(Employee::getDepartment)
                 .distinct()
                 .forEach(System.out::println);

        // 3. Average age by gender
        System.out.println("\n3. Average Age by Gender:");
        System.out.println(
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getGender,
                         Collectors.averagingInt(Employee::getAge)))
        );

        // 4. Highest paid employee
        System.out.println("\n4. Highest Paid Employee:");
        System.out.println(
            employees.stream()
                     .max(Comparator.comparingDouble(Employee::getSalary))
                     .get()
        );

        // 5. Joined after 2015
        System.out.println("\n5. Employees joined after 2015:");
        employees.stream()
                 .filter(e -> e.getYearOfJoining() > 2015)
                 .map(Employee::getName)
                 .forEach(System.out::println);

        // 6. Employee count by department
        System.out.println("\n6. Employee count by department:");
        System.out.println(
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment, Collectors.counting()))
        );

        // 7. Average salary by department
        System.out.println("\n7. Average salary by department:");
        System.out.println(
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.averagingDouble(Employee::getSalary)))
        );

        // 8. Youngest male in Product Development
        System.out.println("\n8. Youngest male in Product Development:");
        System.out.println(
            employees.stream()
                     .filter(e -> e.getGender().equals("Male")
                              && e.getDepartment().equals("Product Development"))
                     .min(Comparator.comparingInt(Employee::getAge))
                     .get()
        );

        // 9. Most experienced employee
        System.out.println("\n9. Most experienced employee:");
        System.out.println(
            employees.stream()
                     .min(Comparator.comparingInt(Employee::getYearOfJoining))
                     .get()
        );

        // 10. Male & Female in Sales
        System.out.println("\n10. Male & Female count in Sales:");
        System.out.println(
            employees.stream()
                     .filter(e -> e.getDepartment().equals("Sales"))
                     .collect(Collectors.groupingBy(
                         Employee::getGender, Collectors.counting()))
        );

        // 11. Average salary by gender
        System.out.println("\n11. Average salary by gender:");
        System.out.println(
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getGender,
                         Collectors.averagingDouble(Employee::getSalary)))
        );

        // 12. Employees by department
        System.out.println("\n12. Employees by department:");
        System.out.println(
            employees.stream()
                     .collect(Collectors.groupingBy(Employee::getDepartment))
        );

        // 13. Average & total salary
        System.out.println("\n13. Salary statistics:");
        DoubleSummaryStatistics stats =
            employees.stream()
                     .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Total: " + stats.getSum());

        // 14. Salary > 25k
        System.out.println("\n14. Employees with salary > 25000:");
        employees.stream()
                 .filter(e -> e.getSalary() > 25000)
                 .forEach(System.out::println);

        // 15. Highest paid
        System.out.println("\n15. Highest paid:");
        System.out.println(
            employees.stream()
                     .max(Comparator.comparingDouble(Employee::getSalary))
                     .get()
        );

        // 16. Second highest paid
        System.out.println("\n16. Second highest paid:");
        System.out.println(
            employees.stream()
                     .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                     .skip(1)
                     .findFirst()
                     .get()
        );

        // 17. Third highest paid
        System.out.println("\n17. Third highest paid:");
        System.out.println(
            employees.stream()
                     .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                     .skip(2)
                     .findFirst()
                     .get()
        );

        // 18. Lowest paid
        System.out.println("\n18. Lowest paid:");
        System.out.println(
            employees.stream()
                     .min(Comparator.comparingDouble(Employee::getSalary))
                     .get()
        );

        // 19. Second lowest paid
        System.out.println("\n19. Second lowest paid:");
        System.out.println(
            employees.stream()
                     .sorted(Comparator.comparingDouble(Employee::getSalary))
                     .skip(1)
                     .findFirst()
                     .get()
        );

        // 20. First five lowest paid
        System.out.println("\n20. First five lowest paid:");
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::getSalary))
                 .limit(5)
                 .forEach(System.out::println);

        // 21. First five highest paid
        System.out.println("\n21. First five highest paid:");
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                 .limit(5)
                 .forEach(System.out::println);
    }
}
