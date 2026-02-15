package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

public class EvenValueKeys {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 2);
        map.put("B", 3);
        map.put("C", 4);

        List<String> keys =
                map.entrySet()
                   .stream()
                   .filter(e -> e.getValue() % 2 == 0)
                   .map(e -> e.getKey())
                   .collect(Collectors.toList());

        System.out.println(keys);
    }
}
