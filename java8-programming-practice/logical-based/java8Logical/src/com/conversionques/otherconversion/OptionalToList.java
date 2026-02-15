package com.conversionques.otherconversion;
import java.util.*;

public class OptionalToList {
    public static void main(String[] args) {

        Optional<String> opt = Optional.of("Java");

        List<String> list =
                opt.map(Collections::singletonList)
                   .orElse(Collections.emptyList());

        System.out.println(list);
    }
}
