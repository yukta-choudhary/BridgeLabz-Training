package com.conversionques.listtomap;
import java.util.*;
import java.util.stream.*;

public class Q1_ListToMap_StringLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "API");

        Map<String, Integer> result =
                list.stream()
                    .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length()
                    ));

        System.out.println(result);
    }
}
