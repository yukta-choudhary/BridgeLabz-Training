package com.day1.studentsystem;

import java.util.*;
import java.util.function.*;

public class StudentLambdaDemo {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Amit", 17, 65, 3),
                new Student("Neha", 19, 82, 1),
                new Student("Ravi", 20, 35, 4),
                new Student("Suman", 18, 55, 2)
        );

        /* 1. Welcome message using lambda */
        System.out.println("Welcome Message:");
        Consumer<String> welcome = name ->
                System.out.println("Welcome student " + name);
        welcome.accept("Rahul");

        /* 2. Pass or Fail based on marks */
        System.out.println("\nPass or Fail Check:");
        Predicate<Integer> passFail = marks -> marks >= 40;
        System.out.println("Marks 35 Pass? " + passFail.test(35));
        System.out.println("Marks 60 Pass? " + passFail.test(60));

        /* 3. Sort students by name */
        System.out.println("\nStudents sorted by name:");
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        students.forEach(System.out::println);

        /* 4. Sort students by rank */
        System.out.println("\nStudents sorted by rank:");
        students.sort((s1, s2) -> s1.rank - s2.rank);
        students.forEach(System.out::println);

        /* 5. Display students whose age is above 18 */
        System.out.println("\nStudents with age above 18:");
        students.forEach(s -> {
            if (s.age > 18) {
                System.out.println(s);
            }
        });
    }
}
