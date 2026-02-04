package com.logicalques;
// Q18: Find first non-repeated character
// Input: "stress"
// Output: t

import java.util.*;
import java.util.stream.*;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "stress";

        Character result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(result);
    }
}
