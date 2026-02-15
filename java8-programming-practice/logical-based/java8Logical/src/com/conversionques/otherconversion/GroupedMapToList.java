package com.conversionques.otherconversion;
import java.util.*;
import java.util.stream.*;

public class GroupedMapToList {
    public static void main(String[] args) {

        Map<Integer, List<String>> map = new HashMap<>();
        map.put(3, Arrays.asList("cat", "dog"));
        map.put(5, Arrays.asList("apple"));

        List<String> list =
                map.values()
                   .stream()
                   .flatMap(List::stream)
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}
