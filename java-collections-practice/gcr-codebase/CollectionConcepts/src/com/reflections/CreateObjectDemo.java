package com.reflections;

//Create object dynamically

import java.lang.reflect.Constructor;

class Student {
 String name;

 public Student(String name) {
     this.name = name;
 }

 public void show() {
     System.out.println("Name: " + name);
 }
}

public class CreateObjectDemo {
 public static void main(String[] args) throws Exception {

     Class<?> cls = Student.class;

     // Get constructor
     Constructor<?> con = cls.getConstructor(String.class);

     // Create object
     Student s = (Student) con.newInstance("Yukta");
     s.show();
 }
}
