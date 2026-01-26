package com.reflections;
//Access and modify private field

import java.lang.reflect.Field;

class Person {
 private int age = 20;
}

public class PrivateFieldDemo {
 public static void main(String[] args) throws Exception {

     Person p = new Person();
     Class<?> cls = p.getClass();

     // Access private field
     Field f = cls.getDeclaredField("age");
     f.setAccessible(true);

     // Get value
     System.out.println("Old Age: " + f.get(p));

     // Modify value
     f.set(p, 25);

     // Get new value
     System.out.println("New Age: " + f.get(p));
 }
}

