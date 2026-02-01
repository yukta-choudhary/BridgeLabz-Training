package com.day1.studentsystem;
public class Student {

    String name;
    int age;
    int marks;
    int rank;

    public Student(String name, int age, int marks, int rank) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Marks: " + marks + " | Rank: " + rank;
    }
}

