package com.conversionques.listtomap;
import java.util.*;
import java.util.stream.*;

class Employee {
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }
}

public class Q3_ListEmployeeToMap {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Amit"),
                new Employee(2, "Neha")
        );

        Map<Integer, String> result =
                list.stream()
                    .collect(Collectors.toMap(
                        e -> e.getId(),
                        e -> e.getName()
                    ));

        System.out.println(result);
    }
}
