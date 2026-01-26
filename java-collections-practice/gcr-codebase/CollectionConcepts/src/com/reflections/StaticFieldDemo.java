package com.reflections;
//Modify static field using Reflection

import java.lang.reflect.Field;

class Configuration {
 private static String API_KEY = "OLD_KEY";
}

public class StaticFieldDemo {
 public static void main(String[] args) throws Exception {

     Class<?> cls = Configuration.class;

     Field f = cls.getDeclaredField("API_KEY");
     f.setAccessible(true);

     // Modify static field
     f.set(null, "NEW_KEY");

     System.out.println("API Key Updated");
 }
}
