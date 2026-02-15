package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

public class SortByKeyList {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("C", 3);
        map.put("A", 1);
        map.put("B", 2);

        List<Map.Entry<String, Integer>> list =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByKey())
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}
