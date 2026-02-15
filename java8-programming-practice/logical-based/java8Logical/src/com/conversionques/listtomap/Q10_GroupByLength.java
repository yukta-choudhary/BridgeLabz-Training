package com.conversionques.listtomap;
import java.util.*;
import java.util.stream.*;

public class Q10_GroupByLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "API", "Spring");

        Map<Integer, List<String>> result =
                list.stream()
                    .collect(Collectors.groupingBy(
                        s -> s.length()
                    ));

        System.out.println(result);
    }
}
