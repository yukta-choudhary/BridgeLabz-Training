package com.conversionques.objectcollection;
import java.util.*;
import java.util.stream.*;

public class EmployeeCompositeKeyMap {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Amit", "IT", 50000),
                new Employee(2, "Neha", "HR", 40000)
        );

        Map<String, Employee> map =
                list.stream()
                    .collect(Collectors.toMap(
                        e -> e.id + "-" + e.dept,
                        e -> e
                    ));

        System.out.println(map);
    }
}
