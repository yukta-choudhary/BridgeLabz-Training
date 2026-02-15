package com.conversionques.listtomap;
import java.util.*;
import java.util.stream.*;

class Student {
    private int rollNo;
    private String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    int getRollNo() {
        return rollNo;
    }

    String getName() {
        return name;
    }
}

public class Q6_CustomKeyField {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(101, "Ravi"),
                new Student(102, "Sneha")
        );

        Map<Integer, Student> result =
                list.stream()
                    .collect(Collectors.toMap(
                        s -> s.getRollNo(),
                        s -> s
                    ));

        System.out.println(result);
    }
}
