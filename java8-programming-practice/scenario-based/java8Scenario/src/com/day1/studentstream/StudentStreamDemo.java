package com.day1.studentstream;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStreamDemo {

    static class Student {
        int id;
        String name;
        String firstName;
        int age;
        String gender;
        String city;
        String department;
        int rank;
        List<String> contacts;

        public Student(int id, String name, String firstName, int age,
                       String gender, String city, String department,
                       int rank, List<String> contacts) {
            this.id = id;
            this.name = name;
            this.firstName = firstName;
            this.age = age;
            this.gender = gender;
            this.city = city;
            this.department = department;
            this.rank = rank;
            this.contacts = contacts;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getGender() { return gender; }
        public String getCity() { return city; }
        public String getDepartment() { return department; }
        public int getRank() { return rank; }
        public List<String> getContacts() { return contacts; }

        @Override
        public String toString() {
            return name + " | " + department + " | Rank: " + rank + " | Age: " + age;
        }
    }

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Suresh", "Suresh", 22, "Male", "Mumbai", "Computer Engineering", 10, Arrays.asList("111", "222")),
            new Student(2, "Anita", "Anita", 26, "Female", "Delhi", "Mechanical Engineering", 35, Arrays.asList("333")),
            new Student(3, "Rahul", "Rahul", 24, "Male", "Bangalore", "Electronics Engineering", 50, Arrays.asList("444", "555")),
            new Student(4, "Sneha", "Sneha", 28, "Female", "Mumbai", "Computer Engineering", 5, Arrays.asList("666")),
            new Student(5, "Vikas", "Vikas", 30, "Male", "Karnataka", "Electronics Engineering", 120, Arrays.asList("777")),
            new Student(6, "Simran", "Simran", 21, "Female", "Punjab", "Mechanical Engineering", 18, Arrays.asList("888", "999")),
            new Student(7, "Amit", "Amit", 27, "Male", "Karnataka", "Biotech Engineering", 70, Arrays.asList("101"))
        );

        /* ================= BASIC FILTERING & MAPPING ================= */

        System.out.println("\nStudents with rank < 50:");
        students.stream().filter(s -> s.getRank() < 50).forEach(System.out::println);

        System.out.println("\nStudents with age > 25:");
        students.stream().filter(s -> s.getAge() > 25).forEach(System.out::println);

        System.out.println("\nNames of all students:");
        students.stream().map(Student::getName).forEach(System.out::println);

        System.out.println("\nStudents from Mechanical Engineering:");
        students.stream().filter(s -> s.getDepartment().equals("Mechanical Engineering"))
                .forEach(System.out::println);

        System.out.println("\nStudents not from Mumbai:");
        students.stream().filter(s -> !s.getCity().equals("Mumbai"))
                .forEach(System.out::println);

        /* ================= SORTING & LIMITING ================= */

        System.out.println("\nStudents sorted by rank (Ascending):");
        students.stream().sorted(Comparator.comparingInt(Student::getRank))
                .forEach(System.out::println);

        System.out.println("\nStudents sorted by age (Descending):");
        students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed())
                .forEach(System.out::println);

        System.out.println("\nTop 5 students based on rank:");
        students.stream().sorted(Comparator.comparingInt(Student::getRank))
                .limit(5).forEach(System.out::println);

        System.out.println("\nLast 3 students based on rank:");
        students.stream().sorted(Comparator.comparingInt(Student::getRank).reversed())
                .limit(3).forEach(System.out::println);

        System.out.println("\nStudents sorted by name and then rank:");
        students.stream()
                .sorted(Comparator.comparing(Student::getName)
                .thenComparing(Student::getRank))
                .forEach(System.out::println);

        /* ================= GROUPING & AGGREGATION ================= */

        System.out.println("\nNumber of students in each department:");
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting())));

        System.out.println("\nNumber of students in each city:");
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getCity, Collectors.counting())));

        System.out.println("\nAverage age by department:");
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.averagingInt(Student::getAge))));

        System.out.println("\nAverage rank by gender:");
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.averagingInt(Student::getRank))));

        System.out.println("\nTotal number of students:");
        System.out.println(students.size());

        System.out.println("\nDepartment with highest average rank:");
        System.out.println(
            students.stream()
                    .collect(Collectors.groupingBy(Student::getDepartment,
                            Collectors.averagingInt(Student::getRank)))
                    .entrySet().stream()
                    .min(Map.Entry.comparingByValue())
                    .get()
        );

        /* ================= MIN / MAX / RANKING ================= */

        System.out.println("\nBest rank holder:");
        System.out.println(students.stream().min(Comparator.comparingInt(Student::getRank)).get());

        System.out.println("\nWorst rank holder:");
        System.out.println(students.stream().max(Comparator.comparingInt(Student::getRank)).get());

        System.out.println("\nSecond best rank holder:");
        System.out.println(students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(1).findFirst().get());

        System.out.println("\nThird best rank holder:");
        System.out.println(students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(2).findFirst().get());

        System.out.println("\nYoungest student:");
        System.out.println(students.stream().min(Comparator.comparingInt(Student::getAge)).get());

        System.out.println("\nOldest student:");
        System.out.println(students.stream().max(Comparator.comparingInt(Student::getAge)).get());

        /* ================= FLATMAP & COLLECTIONS ================= */

        System.out.println("\nAll contact numbers:");
        students.stream().flatMap(s -> s.getContacts().stream())
                .forEach(System.out::println);

        System.out.println("\nTotal number of contact numbers:");
        System.out.println(students.stream()
                .flatMap(s -> s.getContacts().stream()).count());

        System.out.println("\nStudents with more than one contact:");
        students.stream().filter(s -> s.getContacts().size() > 1)
                .forEach(System.out::println);

        System.out.println("\nUnique contact numbers:");
        students.stream().flatMap(s -> s.getContacts().stream())
                .distinct().forEach(System.out::println);

        /* ================= CONDITIONAL & MATCHING ================= */

        System.out.println("\nAny student from Biotech Engineering?");
        System.out.println(students.stream()
                .anyMatch(s -> s.getDepartment().equals("Biotech Engineering")));

        System.out.println("\nAre all students above age 20?");
        System.out.println(students.stream().allMatch(s -> s.getAge() > 20));

        System.out.println("\nNo student from Civil Engineering?");
        System.out.println(students.stream()
                .noneMatch(s -> s.getDepartment().equals("Civil Engineering")));

        /* ================= GENDER-BASED ANALYSIS ================= */

        System.out.println("\nMale and Female student count:");
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting())));

        System.out.println("\nAverage age of male students:");
        System.out.println(students.stream()
                .filter(s -> s.getGender().equals("Male"))
                .collect(Collectors.averagingInt(Student::getAge)));

        System.out.println("\nAverage age of female students:");
        System.out.println(students.stream()
                .filter(s -> s.getGender().equals("Female"))
                .collect(Collectors.averagingInt(Student::getAge)));

        System.out.println("\nHighest ranked male student:");
        System.out.println(students.stream()
                .filter(s -> s.getGender().equals("Male"))
                .min(Comparator.comparingInt(Student::getRank))
                .get());

        System.out.println("\nHighest ranked female student:");
        System.out.println(students.stream()
                .filter(s -> s.getGender().equals("Female"))
                .min(Comparator.comparingInt(Student::getRank))
                .get());

        /* ================= DEPARTMENT-SPECIFIC ================= */

        System.out.println("\nStudents department-wise (names only):");
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.toList())
                )));

        System.out.println("\nYoungest student in Computer Engineering:");
        System.out.println(students.stream()
                .filter(s -> s.getDepartment().equals("Computer Engineering"))
                .min(Comparator.comparingInt(Student::getAge))
                .get());

        System.out.println("\nTop-ranked student in Mechanical Engineering:");
        System.out.println(students.stream()
                .filter(s -> s.getDepartment().equals("Mechanical Engineering"))
                .min(Comparator.comparingInt(Student::getRank))
                .get());

        System.out.println("\nCount of Electronics Engineering students from Karnataka:");
        System.out.println(students.stream()
                .filter(s -> s.getDepartment().equals("Electronics Engineering")
                          && s.getCity().equals("Karnataka"))
                .count());

        /* ================= ADVANCED LEVEL ================= */

        System.out.println("\nMap<Id, Name>:");
        System.out.println(students.stream()
                .collect(Collectors.toMap(Student::getId, Student::getName)));

        System.out.println("\nMap<Department, List<Student>>:");
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment)));

        System.out.println("\nStudents whose name starts with 'S':");
        students.stream().filter(s -> s.getName().startsWith("S"))
                .forEach(System.out::println);

        System.out.println("\nStudents whose name length > 5:");
        students.stream().filter(s -> s.getName().length() > 5)
                .forEach(System.out::println);

        System.out.println("\nStudents with even rank:");
        students.stream().filter(s -> s.getRank() % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\nStudents with odd rank:");
        students.stream().filter(s -> s.getRank() % 2 != 0)
                .forEach(System.out::println);

        /* ================= BONUS CHALLENGES ================= */

        System.out.println("\nTop 3 youngest students:");
        students.stream().sorted(Comparator.comparingInt(Student::getAge))
                .limit(3).forEach(System.out::println);

        System.out.println("\nTop 3 oldest students:");
        students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed())
                .limit(3).forEach(System.out::println);

        System.out.println("\nPartition students based on age > 25:");
        System.out.println(students.stream()
                .collect(Collectors.partitioningBy(s -> s.getAge() > 25)));

        System.out.println("\nPartition students based on rank < 100:");
        System.out.println(students.stream()
                .collect(Collectors.partitioningBy(s -> s.getRank() < 100)));

        System.out.println("\nCity having maximum students:");
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get());

        System.out.println("\nDepartment having minimum students:");
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .get());
    }
}

