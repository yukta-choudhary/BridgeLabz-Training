package com.logicalques;
// Q19: Convert List<Integer> to List<String>
// Input: [1,2,3]
// Output: ["1","2","3"]

import java.util.*;
import java.util.stream.*;

public class IntToStringList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

        List<String> result = list.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
