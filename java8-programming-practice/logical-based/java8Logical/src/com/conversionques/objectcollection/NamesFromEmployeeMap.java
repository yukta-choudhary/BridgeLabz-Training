package com.conversionques.objectcollection;
import java.util.*;
import java.util.stream.*;

public class NamesFromEmployeeMap {
    public static void main(String[] args) {

        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, new Employee(1, "Amit", "IT", 50000));
        map.put(2, new Employee(2, "Neha", "HR", 40000));

        List<String> names =
                map.values()
                   .stream()
                   .map(e -> e.name)
                   .collect(Collectors.toList());

        System.out.println(names);
    }
}
