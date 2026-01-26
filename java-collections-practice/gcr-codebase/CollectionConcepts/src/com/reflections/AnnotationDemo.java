package com.reflections;
//Custom annotation

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
 String name();
}

@Author(name = "Yukta")
class Book {}

public class AnnotationDemo {
 public static void main(String[] args) {

     Class<Book> cls = Book.class;

     // Get annotation
     Author a = cls.getAnnotation(Author.class);
     System.out.println("Author: " + a.name());
 }
}
