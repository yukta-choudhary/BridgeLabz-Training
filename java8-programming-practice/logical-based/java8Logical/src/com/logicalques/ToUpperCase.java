package com.logicalques;
// Q4: Convert list of strings to uppercase
// Input: ["java","spring","boot"]
// Output: ["JAVA","SPRING","BOOT"]

import java.util.*;
import java.util.stream.*;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","spring","boot");

        List<String> result = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
