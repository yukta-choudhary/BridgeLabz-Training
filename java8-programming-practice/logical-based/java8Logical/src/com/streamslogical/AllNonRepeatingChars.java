package com.streamslogical;
// Q4: All Non-Repeating Characters using Java Stream
// Input: "programming"
// Output: p o g r a i n

import java.util.*;
import java.util.stream.*;

public class AllNonRepeatingChars {
    public static void main(String[] args) {

        String input = "programming";

        input.chars()
             .mapToObj(c -> (char) c)
             .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
             .entrySet()
             .stream()
             .filter(e -> e.getValue() == 1)
             .map(Map.Entry::getKey)
             .forEach(c -> System.out.print(c + " "));
    }
}
