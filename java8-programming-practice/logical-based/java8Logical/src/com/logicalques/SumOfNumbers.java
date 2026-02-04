package com.logicalques;
// Q8: Sum of all numbers using stream
// Input: [1,2,3,4,5]
// Output: 15

import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
