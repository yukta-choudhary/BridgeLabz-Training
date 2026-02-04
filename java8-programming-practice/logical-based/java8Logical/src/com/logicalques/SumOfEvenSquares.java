package com.logicalques;
// Q26: Find sum of squares of even numbers
// Input: [1,2,3,4,5]
// Output: 20

import java.util.*;

public class SumOfEvenSquares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
