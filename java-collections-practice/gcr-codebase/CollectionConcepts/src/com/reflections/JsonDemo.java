package com.reflections;

//Convert object to JSON-like string

import java.lang.reflect.Field;

class Product {
 String name = "Pen";
 int price = 10;
}

public class JsonDemo {
 public static void main(String[] args) throws Exception {

     Product p = new Product();
     Class<?> cls = p.getClass();

     String json = "{";

     for (Field f : cls.getDeclaredFields()) {
         f.setAccessible(true);
         json += "\"" + f.getName() + "\":\"" + f.get(p) + "\",";
     }

     json = json.substring(0, json.length() - 1) + "}";
     System.out.println(json);
 }
}
