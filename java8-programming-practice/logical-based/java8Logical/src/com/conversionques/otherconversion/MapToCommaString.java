package com.conversionques.otherconversion;
import java.util.*;
import java.util.stream.*;

public class MapToCommaString {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 8);
        map.put("Python", 3);

        String result =
                map.entrySet()
                   .stream()
                   .map(e -> e.getKey() + "=" + e.getValue())
                   .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
