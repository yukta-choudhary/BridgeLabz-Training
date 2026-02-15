package com.conversionques.otherconversion;
import java.util.*;
import java.util.stream.*;

public class ListToGroupedMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("cat", "dog", "apple");

        Map<Integer, List<String>> map =
                list.stream()
                    .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(map);
    }
}
