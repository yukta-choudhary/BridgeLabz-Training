package com.logicalques;
// Q20: Count occurrences of each word
// Input: "java is java and java is fast"
// Output: {java=3, is=2, and=1, fast=1}

import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "java is java and java is fast";

        Map<String, Long> map = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(map);
    }
}
