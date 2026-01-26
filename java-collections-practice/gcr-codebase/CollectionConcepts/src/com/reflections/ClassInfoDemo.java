package com.reflections;
//Get class information using Reflection

import java.lang.reflect.*;

public class ClassInfoDemo {
 public static void main(String[] args) throws Exception {

     // Take class name
     Class<?> cls = Class.forName("java.lang.String");

     // Print class name
     System.out.println("Class Name: " + cls.getName());

     // Print methods
     Method[] methods = cls.getDeclaredMethods();
     System.out.println("Methods:");
     for (Method m : methods) {
         System.out.println(m.getName());
     }

     // Print fields
     Field[] fields = cls.getDeclaredFields();
     System.out.println("Fields:");
     for (Field f : fields) {
         System.out.println(f.getName());
     }

     // Print constructors
     Constructor<?>[] cons = cls.getDeclaredConstructors();
     System.out.println("Constructors:");
     for (Constructor<?> c : cons) {
         System.out.println(c);
     }
 }
}

