package com.conversionques.listtoset;
import java.util.*;

public class SortedSet {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 1, 3, 2);

        Set<Integer> set = new TreeSet<>(list);

        System.out.println(set);
    }
}
