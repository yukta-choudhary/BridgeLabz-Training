package com.day3.campusconnectprogram;


import java.util.*;

public class CampusConnect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faculty input
        System.out.println("Enter Faculty ID:");
        int fid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Faculty Name:");
        String fname = sc.nextLine();

        System.out.println("Enter Faculty Email:");
        String femail = sc.nextLine();

        System.out.println("Enter Department:");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fid, fname, femail, dept);

        // Student input
        System.out.println("Enter Student ID:");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String sname = sc.nextLine();

        System.out.println("Enter Student Email:");
        String semail = sc.nextLine();

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter grade " + (i + 1) + ":");
            grades[i] = sc.nextInt();
        }

        Student student = new Student(sid, sname, semail, grades);

        // Course creation
        Course course = new Course("Java Programming", faculty);
        course.addStudent(student);

        // Course actions
        student.enrollCourse("Java Programming");

        // Polymorphism
        Person p1 = student;
        Person p2 = faculty;

        System.out.println("\nStudent Details");
        p1.printDetails();

        System.out.println("\nFaculty Details");
        p2.printDetails();

        System.out.println("\nCourse Details");
        course.showCourseDetails();

        sc.close();
    }
}
