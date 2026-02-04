package com.logicalques;
// Q23: Find longest string
// Input: ["java","microservices","api"]
// Output: "microservices"

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","microservices","api");

        String result = list.stream()
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println(result);
    }
}
