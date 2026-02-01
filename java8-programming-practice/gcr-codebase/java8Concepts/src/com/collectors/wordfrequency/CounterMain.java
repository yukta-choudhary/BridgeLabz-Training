package com.collectors.wordfrequency;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CounterMain {

    public static void main(String[] args) {

        String paragraph = "Java streams are powerful and streams make Java powerful";

        Map<String, Long> wordFrequency = Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                .collect(Collectors.toMap(
                        Function.identity(),
                        word -> 1L,
                        Long::sum
                ));

        wordFrequency.forEach((word, count) ->
                System.out.println(word + " → " + count));
    }
}
