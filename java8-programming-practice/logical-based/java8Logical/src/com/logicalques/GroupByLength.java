package com.logicalques;
// Q17: Group strings by length
// Input: ["a","bb","ccc","dd"]
// Output: {1=[a], 2=[bb,dd], 3=[ccc]}

import java.util.*;
import java.util.stream.*;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","bb","ccc","dd");

        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(map);
    }
}
