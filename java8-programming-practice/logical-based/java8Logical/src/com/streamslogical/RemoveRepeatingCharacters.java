package com.streamslogical;
// Q6: Remove Repeating Characters (Keep Only Unique Once)
// Input: "aabbccdde"
// Output: "e"

import java.util.*;
import java.util.stream.*;

public class RemoveRepeatingCharacters {
    public static void main(String[] args) {

        String input = "aabbccdde";

        String result =
                input.chars()
                     .mapToObj(c -> (char) c)
                     .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                     .entrySet()
                     .stream()
                     .filter(e -> e.getValue() == 1)
                     .map(e -> String.valueOf(e.getKey()))
                     .collect(Collectors.joining());

        System.out.println(result);
    }
}
