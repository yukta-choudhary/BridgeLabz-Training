package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

public class FilterByValue {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 15);
        map.put("C", 25);

        int N = 10;

        List<Map.Entry<String, Integer>> result =
                map.entrySet()
                   .stream()
                   .filter(e -> e.getValue() > N)
                   .collect(Collectors.toList());

        System.out.println(result);
    }
}
