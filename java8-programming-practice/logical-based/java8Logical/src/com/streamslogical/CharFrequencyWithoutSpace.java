package com.streamslogical;
// Q10: Count Each Character Except Spaces using Java Stream
// Input: "java stream"
// Output: frequency map without space

import java.util.*;
import java.util.stream.*;

public class CharFrequencyWithoutSpace {
    public static void main(String[] args) {

        String input = "java stream";

        Map<Character, Long> result =
                input.chars()
                     .filter(c -> c != ' ')
                     .mapToObj(c -> (char) c)
                     .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(result);
    }
}
