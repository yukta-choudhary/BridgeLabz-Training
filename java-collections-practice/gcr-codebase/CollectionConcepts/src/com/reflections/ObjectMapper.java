package com.reflections;

//Map values to object using Reflection

import java.lang.reflect.Field;
import java.util.Map;

class User {
 String name;
 int age;
}

public class ObjectMapper {

 public static <T> T toObject(Class<T> cls, Map<String, Object> map) throws Exception {

     T obj = cls.getDeclaredConstructor().newInstance();

     for (String key : map.keySet()) {
         Field f = cls.getDeclaredField(key);
         f.setAccessible(true);
         f.set(obj, map.get(key));
     }
     return obj;
 }
}

