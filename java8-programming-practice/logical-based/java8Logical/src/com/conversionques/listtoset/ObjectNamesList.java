package com.conversionques.listtoset;
import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class ObjectNamesList {
    public static void main(String[] args) {

        Set<Person> set = new HashSet<>();
        set.add(new Person("Amit"));
        set.add(new Person("Neha"));

        List<String> names = new ArrayList<>();

        for (Person p : set) {
            names.add(p.getName());
        }

        System.out.println(names);
    }
}
