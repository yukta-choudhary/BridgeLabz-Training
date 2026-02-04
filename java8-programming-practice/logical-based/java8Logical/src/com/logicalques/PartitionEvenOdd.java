package com.logicalques;
// Q21: Partition numbers into even and odd
// Input: [1,2,3,4,5,6]
// Output: {even=[2,4,6], odd=[1,3,5]}

import java.util.*;
import java.util.stream.*;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Map<Boolean, List<Integer>> map = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("even=" + map.get(true));
        System.out.println("odd=" + map.get(false));
    }
}
