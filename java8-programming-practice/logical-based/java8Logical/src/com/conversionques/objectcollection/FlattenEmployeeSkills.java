package com.conversionques.objectcollection;
import java.util.*;
import java.util.stream.*;

class Emp {
    String name;
    List<String> skills;

    Emp(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }
}

public class FlattenEmployeeSkills {
    public static void main(String[] args) {

        List<Emp> list = Arrays.asList(
                new Emp("Amit", Arrays.asList("Java", "SQL")),
                new Emp("Neha", Arrays.asList("HR", "Payroll"))
        );

        List<String> skills =
                list.stream()
                    .flatMap(e -> e.skills.stream())
                    .collect(Collectors.toList());

        System.out.println(skills);
    }
}
