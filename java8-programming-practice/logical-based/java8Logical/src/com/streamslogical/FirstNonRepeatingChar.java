package com.streamslogical;
// Q3: First Non-Repeating Character using Java Stream
// Input: "stress"
// Output: t

import java.util.*;
import java.util.stream.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String input = "stress";

        Character result =
                input.chars()
                     .mapToObj(c -> (char) c)
                     .collect(Collectors.groupingBy(
                             c -> c, LinkedHashMap::new, Collectors.counting()))
                     .entrySet()
                     .stream()
                     .filter(e -> e.getValue() == 1)
                     .map(Map.Entry::getKey)
                     .findFirst()
                     .orElse(null);

        System.out.println(result);
    }
}
