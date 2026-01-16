package com.generics.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

// Question: University Course Management using Generics

public class UniversitySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lists for different courses
        ArrayList<ExamCourse> examList = new ArrayList<>();
        ArrayList<AssignmentCourse> assignList = new ArrayList<>();
        ArrayList<ResearchCourse> researchList = new ArrayList<>();

        System.out.print("Enter Exam Course name: ");
        String examName = sc.nextLine();
        examList.add(new ExamCourse(examName));

        System.out.print("Enter Assignment Course name: ");
        String assignName = sc.nextLine();
        assignList.add(new AssignmentCourse(assignName));

        System.out.print("Enter Research Course name: ");
        String researchName = sc.nextLine();
        researchList.add(new ResearchCourse(researchName));

        System.out.println("\n--- Course Evaluation ---");

        // Display using wildcard method
        CourseUtility.displayCourses(examList);
        CourseUtility.displayCourses(assignList);
        CourseUtility.displayCourses(researchList);

        sc.close();
    }
}
