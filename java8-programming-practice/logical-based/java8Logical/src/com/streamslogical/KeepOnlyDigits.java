package com.streamslogical;
// Q9: Keep Only Digits using Java Stream
// Input: "orderId=AB123XZ9"
// Output: "1239"

import java.util.stream.*;

public class KeepOnlyDigits {
    public static void main(String[] args) {

        String input = "orderId=AB123XZ9";

        String result =
                input.chars()
                     .filter(Character::isDigit)
                     .mapToObj(c -> String.valueOf((char) c))
                     .collect(Collectors.joining());

        System.out.println(result);
    }
}
