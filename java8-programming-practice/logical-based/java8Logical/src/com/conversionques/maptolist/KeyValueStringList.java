package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

public class KeyValueStringList {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 30);

        List<String> result =
                map.entrySet()
                   .stream()
                   .map(e -> e.getKey() + " = " + e.getValue())
                   .collect(Collectors.toList());

        System.out.println(result);
    }
}
