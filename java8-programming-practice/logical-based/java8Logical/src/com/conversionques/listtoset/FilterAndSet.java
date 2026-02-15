package com.conversionques.listtoset;
import java.util.*;

public class FilterAndSet {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 10, 15, 20);

        Set<Integer> set = new HashSet<>();

        for (Integer i : list) {
            if (i > 10) {
                set.add(i);
            }
        }

        System.out.println(set);
    }
}
