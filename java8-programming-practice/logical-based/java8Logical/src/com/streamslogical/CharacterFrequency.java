package com.streamslogical;
// Q1: Character Frequency Count using Java Stream
// Input: "banana"
// Output: {b=1, a=3, n=2}

import java.util.*;
import java.util.stream.*;

public class CharacterFrequency {
    public static void main(String[] args) {

        String input = "banana";

        Map<Character, Long> result =
                input.chars()
                     .mapToObj(c -> (char) c)
                     .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(result);
    }
}
