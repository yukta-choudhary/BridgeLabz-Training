package com.streamslogical;
// Q7: Remove Non-Alphanumeric Characters using Java Stream
// Input: "ja@va#8!!"
// Output: "java8"

import java.util.stream.*;

public class RemoveNonAlphanumeric {
    public static void main(String[] args) {

        String input = "ja@va#8!!";

        String result =
                input.chars()
                     .filter(Character::isLetterOrDigit)
                     .mapToObj(c -> String.valueOf((char) c))
                     .collect(Collectors.joining());

        System.out.println(result);
    }
}
