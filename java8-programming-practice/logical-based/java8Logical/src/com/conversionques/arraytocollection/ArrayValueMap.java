package com.conversionques.arraytocollection;
import java.util.*;
import java.util.stream.*;

public class ArrayValueMap {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C"};

        Map<String, Integer> map =
                IntStream.range(0, arr.length)
                         .boxed()
                         .collect(Collectors.toMap(
                             i -> arr[i],
                             i -> i
                         ));

        System.out.println(map);
    }
}
