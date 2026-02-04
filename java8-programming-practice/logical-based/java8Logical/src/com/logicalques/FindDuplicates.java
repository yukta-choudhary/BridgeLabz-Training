package com.logicalques;
// Q22: Find duplicate elements only
// Input: [1,2,3,2,4,5,1]
// Output: [1,2]

import java.util.*;
import java.util.stream.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,5,1);

        Set<Integer> seen = new HashSet<>();

        List<Integer> result = list.stream()
                .filter(n -> !seen.add(n))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
