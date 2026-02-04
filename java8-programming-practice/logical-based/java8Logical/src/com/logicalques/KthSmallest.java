package com.logicalques;
// Q30: Find kth smallest element
// Input: [9,1,5,3,7], k=2
// Output: 3

import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,1,5,3,7);
        int k = 2;

        int result = list.stream()
                .sorted()
                .skip(k - 1)
                .findFirst()
                .get();

        System.out.println(result);
    }
}
