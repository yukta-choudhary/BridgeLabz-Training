package com.streamslogical;
// Q2: Word Frequency Count using Java Stream
// Input: "java is java and java is fast"
// Output: {java=3, is=2, and=1, fast=1}

import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {

        String input = "java is java and java is fast";

        Map<String, Long> result =
                Arrays.stream(input.split(" "))
                      .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(result);
    }
}
