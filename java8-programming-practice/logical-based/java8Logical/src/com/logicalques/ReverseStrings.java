package com.logicalques;
// Q10: Reverse each string in list
// Input: ["java","api"]
// Output: ["avaj","ipa"]

import java.util.*;
import java.util.stream.*;

public class ReverseStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","api");

        List<String> result = list.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
