package com.conversionques.objectcollection;
import java.util.*;
import java.util.stream.*;

public class DepartmentSet {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Amit", "IT", 50000),
                new Employee(2, "Neha", "HR", 40000)
        );

        Set<String> depts =
                list.stream()
                    .map(e -> e.dept)
                    .collect(Collectors.toSet());

        System.out.println(depts);
    }
}
