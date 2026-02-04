package com.logicalques;
// Q9: Find max number
// Input: [10,25,3,99,45]
// Output: 99

import java.util.*;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,25,3,99,45);

        int max = list.stream()
                .max(Integer::compare)
                .get();

        System.out.println(max);
    }
}
