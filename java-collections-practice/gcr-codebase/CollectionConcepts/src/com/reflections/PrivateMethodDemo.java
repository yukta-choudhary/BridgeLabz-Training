package com.reflections;

//Invoke private method using Reflection

import java.lang.reflect.Method;

class Calculator {
 private int multiply(int a, int b) {
     return a * b;
 }
}

public class PrivateMethodDemo {
 public static void main(String[] args) throws Exception {

     Calculator c = new Calculator();
     Class<?> cls = c.getClass();

     // Access private method
     Method m = cls.getDeclaredMethod("multiply", int.class, int.class);
     m.setAccessible(true);

     // Invoke method
     int result = (int) m.invoke(c, 4, 5);
     System.out.println("Result: " + result);
 }
}

