package com.conversionques.listtomap;
import java.util.*;
import java.util.stream.*;

public class Q7_HandleDuplicates {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "A");

        Map<String, Integer> result =
                list.stream()
                    .collect(Collectors.toMap(
                        s -> s,
                        s -> 1,
                        (oldValue, newValue) -> oldValue + newValue
                    ));

        System.out.println(result);
    }
}
