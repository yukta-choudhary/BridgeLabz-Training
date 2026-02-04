package com.streamslogical;
// Q5: Remove Duplicate Characters using Java Stream
// Input: "banana"
// Output: "ban"

import java.util.stream.*;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String input = "banana";

        String result =
                input.chars()
                     .distinct()
                     .mapToObj(c -> String.valueOf((char) c))
                     .collect(Collectors.joining());

        System.out.println(result);
    }
}
