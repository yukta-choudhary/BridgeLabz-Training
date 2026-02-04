package com.logicalques;
// Q5: Find string length list
// Input: ["cat","elephant","dog"]
// Output: [3,8,3]

import java.util.*;
import java.util.stream.*;

public class StringLengthList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat","elephant","dog");

        List<Integer> result = list.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
