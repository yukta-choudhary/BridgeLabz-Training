package com.conversionques.objectcollection;
import java.util.*;
import java.util.stream.*;

public class EmployeeNames {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Amit", "IT", 50000),
                new Employee(2, "Neha", "HR", 40000)
        );

        List<String> names =
                list.stream()
                    .map(e -> e.name)
                    .collect(Collectors.toList());

        System.out.println(names);
    }
}
