package com.logicalques;
// Q7: Remove empty strings
// Input: ["java","","spring","","boot"]
// Output: ["java","spring","boot"]

import java.util.*;
import java.util.stream.*;

public class RemoveEmptyStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","","spring","","boot");

        List<String> result = list.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
