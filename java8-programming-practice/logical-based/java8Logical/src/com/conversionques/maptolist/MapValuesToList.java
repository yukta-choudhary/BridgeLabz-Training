package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

public class MapValuesToList {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 15);

        List<Integer> values =
                map.values()
                   .stream()
                   .collect(Collectors.toList());

        System.out.println(values);
    }
}
