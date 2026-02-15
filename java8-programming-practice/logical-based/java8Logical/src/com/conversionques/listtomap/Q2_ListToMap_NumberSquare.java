package com.conversionques.listtomap;
import java.util.*;
import java.util.stream.*;

public class Q2_ListToMap_NumberSquare {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 4);

        Map<Integer, Integer> result =
                numbers.stream()
                       .collect(Collectors.toMap(
                           n -> n,
                           n -> n * n
                       ));

        System.out.println(result);
    }
}
