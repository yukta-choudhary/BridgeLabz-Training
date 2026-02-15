package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

public class MapKeysToList {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 10);
        map.put("Python", 20);

        List<String> keys =
                map.keySet()
                   .stream()
                   .collect(Collectors.toList());

        System.out.println(keys);
    }
}
