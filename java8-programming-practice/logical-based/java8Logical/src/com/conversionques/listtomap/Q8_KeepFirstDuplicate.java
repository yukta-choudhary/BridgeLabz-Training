package com.conversionques.listtomap;
import java.util.*;
import java.util.stream.*;

public class Q8_KeepFirstDuplicate {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "A");

        Map<String, String> result =
                list.stream()
                    .collect(Collectors.toMap(
                        s -> s,
                        s -> s,
                        (oldValue, newValue) -> oldValue
                    ));

        System.out.println(result);
    }
}
