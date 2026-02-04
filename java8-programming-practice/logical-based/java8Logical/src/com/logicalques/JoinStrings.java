package com.logicalques;
// Q14: Join strings with comma
// Input: ["Java","Spring","Boot"]
// Output: "Java,Spring,Boot"

import java.util.*;
import java.util.stream.*;

public class JoinStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Spring","Boot");

        String result = list.stream()
                .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
