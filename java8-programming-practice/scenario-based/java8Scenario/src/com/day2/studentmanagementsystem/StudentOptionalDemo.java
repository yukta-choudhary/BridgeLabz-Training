package com.day2.studentmanagementsystem;

import java.util.Optional;

public class StudentOptionalDemo {

    public static void main(String[] args) {

        Student student = new Student(101, "Ravi", null, null, "Hyd", null);

        // 1. Fetch email safely
        Optional<String> email = Optional.ofNullable(student.getEmail());
        System.out.println("Email: " + email.orElse("Email not available"));

        // 2. Phone number default
        Optional<String> phone = Optional.ofNullable(student.getPhone());
        System.out.println("Phone: " + phone.orElse("9999999999"));

        // 3. Find student by ID
        Optional<Student> foundStudent =
                student.getId() == 101 ? Optional.of(student) : Optional.empty();
        System.out.println(foundStudent.isPresent()
                ? "Student Found"
                : "Student not available");

        // 4. Fetch address safely
        Optional<String> address = Optional.ofNullable(student.getAddress());
        System.out.println("Address: " + address.orElse("Address not found"));

        // 5. Nickname or real name
        Optional<String> nick = Optional.ofNullable(student.getNickName());
        System.out.println("Name: " + nick.orElse(student.getName()));
    }
}

class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String nickName;

    public Student(int id, String name, String email, String phone,
                   String address, String nickName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.nickName = nickName;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getNickName() { return nickName; }
}
