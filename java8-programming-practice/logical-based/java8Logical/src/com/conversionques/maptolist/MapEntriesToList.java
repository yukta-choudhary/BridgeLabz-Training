package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

public class MapEntriesToList {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("X", 1);
        map.put("Y", 2);

        List<Map.Entry<String, Integer>> entries =
                map.entrySet()
                   .stream()
                   .collect(Collectors.toList());

        System.out.println(entries);
    }
}
