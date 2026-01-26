package com.reflections;

//Measure execution time

import java.lang.reflect.Method;

class Task {
 public void work() throws Exception {
     Thread.sleep(200);
 }
}

public class TimingDemo {
 public static void main(String[] args) throws Exception {

     Task t = new Task();
     Method m = t.getClass().getMethod("work");

     long start = System.nanoTime();
     m.invoke(t);
     long end = System.nanoTime();

     System.out.println("Time: " + (end - start));
 }
}
