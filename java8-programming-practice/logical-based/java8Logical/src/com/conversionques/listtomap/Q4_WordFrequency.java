package com.conversionques.listtomap;
import java.util.*;
import java.util.stream.*;

public class Q4_WordFrequency {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "java", "api");

        Map<String, Long> result =
                words.stream()
                     .collect(Collectors.groupingBy(
                         w -> w,
                         Collectors.counting()
                     ));

        System.out.println(result);
    }
}
