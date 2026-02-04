package com.streamslogical;
// Q8: Keep Only Alphabets using Java Stream
// Input: "java8stream2025"
// Output: "javastream"

import java.util.stream.*;

public class KeepOnlyAlphabets {
    public static void main(String[] args) {

        String input = "java8stream2025";

        String result =
                input.chars()
                     .filter(Character::isLetter)
                     .mapToObj(c -> String.valueOf((char) c))
                     .collect(Collectors.joining());

        System.out.println(result);
    }
}
