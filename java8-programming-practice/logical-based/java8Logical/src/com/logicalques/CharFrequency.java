package com.logicalques;
// Q15: Frequency of each character
// Input: "banana"
// Output: {b=1, a=3, n=2}

import java.util.*;
import java.util.stream.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "banana";

        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map);
    }
}
