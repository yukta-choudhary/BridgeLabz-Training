package com.logicalques;
// Q13: Find second highest number
// Input: [10,40,30,20]
// Output: 30

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,40,30,20);

        int second = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(second);
    }
}
