package com.conversionques.listtomap;
import java.util.*;
import java.util.stream.*;

public class Q5_IndexToElement {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C");

        Map<Integer, String> result =
                IntStream.range(0, list.size())
                         .boxed()
                         .collect(Collectors.toMap(
                             i -> i,
                             i -> list.get(i)
                         ));

        System.out.println(result);
    }
}
