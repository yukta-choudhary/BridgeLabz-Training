package com.logicalques;
// Q12: Sort list in descending order
// Input: [5,1,9,3]
// Output: [9,5,3,1]

import java.util.*;
import java.util.stream.*;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,9,3);

        List<Integer> result = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
