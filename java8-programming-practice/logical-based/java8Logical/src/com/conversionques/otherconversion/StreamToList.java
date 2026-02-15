package com.conversionques.otherconversion;
import java.util.*;
import java.util.stream.*;

public class StreamToList {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("A", "B", "C");

        List<String> list =
                stream.collect(Collectors.toList());

        System.out.println(list);
    }
}
