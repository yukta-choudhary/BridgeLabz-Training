package com.logicalques;
// Q16: Find numbers greater than 50
// Input: [10,55,60,23,90]
// Output: [55,60,90]

import java.util.*;
import java.util.stream.*;

public class GreaterThan50 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,55,60,23,90);

        List<Integer> result = list.stream()
                .filter(n -> n > 50)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
