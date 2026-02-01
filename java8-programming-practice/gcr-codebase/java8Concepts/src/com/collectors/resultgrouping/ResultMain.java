package com.collectors.resultgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class ResultMain {

    public static void main(String[] args) {

    	List<Student> students = Arrays.asList(
    	        new Student("Yukta", "Grade 10"),
    	        new Student("Rashi", "Grade 9"),
    	        new Student("Disha", "Grade 10"),
    	        new Student("Shraddha", "Grade 8"),
    	        new Student("Bhumika", "Grade 9")
    	);


        Map<String, List<String>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ));

        groupedStudents.forEach((grade, names) ->
                System.out.println(grade + " → " + names));
    }
}

