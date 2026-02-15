package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

public class SortByValueList {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 30);
        map.put("Two", 10);
        map.put("Three", 20);

        List<Map.Entry<String, Integer>> list =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByValue())
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}
