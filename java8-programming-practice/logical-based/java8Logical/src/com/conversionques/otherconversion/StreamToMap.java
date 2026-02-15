package com.conversionques.otherconversion;
import java.util.*;
import java.util.stream.*;

public class StreamToMap {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Java", "Python");

        Map<String, Integer> map =
                stream.collect(Collectors.toMap(
                        s -> s,
                        s -> s.length()
                ));

        System.out.println(map);
    }
}
