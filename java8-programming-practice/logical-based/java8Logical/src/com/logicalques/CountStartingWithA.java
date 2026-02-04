package com.logicalques;
// Q6: Count strings starting with ‘a’
// Input: ["apple","banana","ant","car"]
// Output: 2

import java.util.*;

public class CountStartingWithA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","ant","car");

        long count = list.stream()
                .filter(s -> s.startsWith("a"))
                .count();

        System.out.println(count);
    }
}
