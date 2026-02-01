package com.collectors.employeesalary;


import java.util.*;
import java.util.stream.Collectors;

public class SalaryMain {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Rashi", "IT", 60000),
                new Employee("Shraddha", "HR", 45000),
                new Employee("Bhumika", "IT", 75000),
                new Employee("Arya", "Finance", 80000),
                new Employee("Disha", "HR", 50000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " → Avg Salary: ₹" + avgSalary));
    }
}
