package com.logicalques;
// Q24: Find top 3 highest numbers
// Input: [10,90,30,70,50]
// Output: [90,70,50]

import java.util.*;
import java.util.stream.*;

public class TopThreeNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,90,30,70,50);

        List<Integer> result = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
