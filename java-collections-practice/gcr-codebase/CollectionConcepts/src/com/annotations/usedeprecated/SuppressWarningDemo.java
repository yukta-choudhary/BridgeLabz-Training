package com.annotations.usedeprecated;

//Suppress unchecked warning

import java.util.ArrayList;

public class SuppressWarningDemo {
 public static void main(String[] args) {

     @SuppressWarnings("unchecked")
     ArrayList list = new ArrayList();

     list.add(10);
     list.add("Hello");

     System.out.println(list);
 }
}

