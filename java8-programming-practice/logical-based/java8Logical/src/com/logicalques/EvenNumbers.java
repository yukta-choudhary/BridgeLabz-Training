package com.logicalques;
// Q3: Find even numbers from list
// Input: [2,5,7,8,10,13]
// Output: [2,8,10]

import java.util.*;
import java.util.stream.*;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,7,8,10,13);

        List<Integer> result = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
