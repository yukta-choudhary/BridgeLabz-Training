package com.reflections;
//Call methods dynamically

import java.lang.reflect.Method;

class MathOperations {
 public int add(int a, int b) { return a + b; }
 public int subtract(int a, int b) { return a - b; }
 public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodDemo {
 public static void main(String[] args) throws Exception {

     MathOperations obj = new MathOperations();
     Class<?> cls = obj.getClass();

     // Method name to call
     String methodName = "add";

     // Get method
     Method m = cls.getMethod(methodName, int.class, int.class);

     // Invoke method
     int result = (int) m.invoke(obj, 10, 5);
     System.out.println("Result: " + result);
 }
}
