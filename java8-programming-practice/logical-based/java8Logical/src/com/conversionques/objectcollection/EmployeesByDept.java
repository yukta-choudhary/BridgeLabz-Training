package com.conversionques.objectcollection;
import java.util.*;
import java.util.stream.*;

public class EmployeesByDept {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Amit", "IT", 50000),
                new Employee(2, "Neha", "IT", 60000),
                new Employee(3, "Ravi", "HR", 40000)
        );

        Map<String, List<Employee>> map =
                list.stream()
                    .collect(Collectors.groupingBy(e -> e.dept));

        System.out.println(map);
    }
}
