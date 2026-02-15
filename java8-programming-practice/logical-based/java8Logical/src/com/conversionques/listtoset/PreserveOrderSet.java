package com.conversionques.listtoset;
import java.util.*;

public class PreserveOrderSet {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "A", "C");

        Set<String> set = new LinkedHashSet<>(list);

        System.out.println(set);
    }
}
